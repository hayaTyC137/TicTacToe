package Practice;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections.*;
import java.util.Comparator;

public class Six {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> food1 = new ArrayList();
        food1.add("Яблоко");
        food1.add("Груша");
        food1.add("Арбуз");

        ArrayList<String> food2= new ArrayList();
        food2.add("Кола");
        food2.add("Спарйт");
        food2.add("Корона");

        ArrayList<String> food3 = new ArrayList();
        food3.add("Карамель");
        food3.add("Шприц");
        food3.add("Отвертка");

        groceryList.add(food1);
        groceryList.add(food2);
        groceryList.add(food3);

        System.out.println(groceryList);

    }
}
