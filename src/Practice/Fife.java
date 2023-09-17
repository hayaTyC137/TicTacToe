package Practice;

import java.util.Random;

public class Fife {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        int temp = 0;
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10)+1;
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < array.length; i++) // <------- сортировка методом пузырька
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        }
    }

