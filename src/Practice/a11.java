package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class a11 {
    public static void main(String[] args) {
        System.out.println("hl");
        int[] testArray = { 1, 2, 3, 2, 4, 2, 4, 5 };
        // methodDefault(testArray, 2);
        // System.out.println("\n");
        // methodArrayList(testArray,4);
    }
    public static void methodDefault(int[] testArray, int number){
            Random random = new Random();
            int offset = 0;

            System.out.print("Массив до удаления: ");
            for (int i :testArray ) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            System.out.print("Массив после удаления: ");
            for (int i = 0; i < testArray.length; i++)
                if (testArray[i] != number) {
                    testArray[i - offset] = testArray[i];
                } else {
                    offset++;
                }
            int[] copied = Arrays.copyOf(testArray, testArray.length - offset);
            for (int j : copied) {
                System.out.print(j + " ");
            }
    }
    public static void methodArrayList(int[] testArray, int number){
        List<Integer> result = new ArrayList<>();
        System.out.print("Массив до удаления: ");
        for (int i :testArray ) {
            System.out.print(i + " ");
        }
        for (int i: testArray) {
            if (i != number){
                result.add(i);
            }
        }
        System.out.print("\n");
        //result.stream().mapToInt(Integer::intValue).toArray();
        result.toArray();
        System.out.print("Массив после удаления: ");
        for (int i:result) {
            System.out.print(i + " ");
        }
    }

}
