package Practice;

import java.util.Scanner;

public class Third {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double firstSide;
        double secondSide;
        double hypotinuse;

        System.out.println("Введите длинну первого катета: ");
        firstSide = scanner.nextDouble();

        System.out.println("Введите длинну второго катета: ");
        secondSide = scanner.nextDouble();

        hypotinuse = Math.sqrt(Math.pow(firstSide, 2)+Math.pow(secondSide, 2));



        System.out.println("Гипотинуза равна: "+hypotinuse);
    }
}
