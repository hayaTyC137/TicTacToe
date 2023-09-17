package Practice;

import java.util.Scanner;
import java.util.Random;

public class PapperRockSccisors {
    public static void main(String[] args){
        int HumanChoise;
        int ComputerChoise;
        int Rock = 1;
        int Scissors = 2;
        int Paper = 3;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Игра камень ножницы бумага");
        System.out.println("1: Камень");
        System.out.println("2: Ножницы");
        System.out.println("3: Бумага");
        HumanChoise = scanner.nextInt();
        ComputerChoise = random.nextInt(3)+1;

        if (HumanChoise == 1 && ComputerChoise == 1){
            System.out.println("Ничья!");
        }
        else if (HumanChoise == 1 && ComputerChoise == 2){
            System.out.println("Вы выйграли!");
        }
        else if (HumanChoise == 1 && ComputerChoise == 3){
            System.out.println("Вы проиграли!");
        }
        else if (HumanChoise == 2 && ComputerChoise == 1){
            System.out.println("Вы проиграли!");
        }
        else if (HumanChoise == 2 && ComputerChoise == 2){
            System.out.println("Ничья!");
        }
        else if (HumanChoise == 3 && ComputerChoise == 1){
            System.out.println("Вы выйиграли");
        }
        else if (HumanChoise == 3 && ComputerChoise == 2){
            System.out.println("Вы проиграли!");
        }
        else if (HumanChoise == 3 && ComputerChoise == 3){
            System.out.println("Ничья!");
        }
    }
}
