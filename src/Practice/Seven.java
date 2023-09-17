package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Seven {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> testArray = new ArrayList<Integer>();
        int i;
        for (i = 0; i < 5; i++) {
            testArray.add(random.nextInt(5)+1);
        }
        System.out.println(testArray);
        removeElement(testArray, 2);
        System.out.println(testArray);

    }
     public static ArrayList<Integer> removeElement(ArrayList<Integer> nums, int value){
        int offset = 0;
        for (int i = 0; i < nums.size(); i++){
            if (nums.get(i) == value){
                offset++;
            }
            else {
                nums.set(i - offset, nums.get(i));
            }
        }
         while (offset > 0) {
             nums.remove(nums.size() - 1);
             offset--;
         }
         return nums;
     }
     public static ArrayList<Integer> removeElementEasyMethod(ArrayList<Integer> nums, int value) { // <----------- куда легче в исполнении
         nums.removeIf(number -> number == value);
         return nums;
     }
}

