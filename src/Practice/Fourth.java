package Practice;

import java.util.Random;
public class Fourth {
    public static void main(String[] args){
        Random random = new Random();
        int firstRandomNumber = random.nextInt(2)+1;
        System.out.println(firstRandomNumber);
    }
}
