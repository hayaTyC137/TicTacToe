package Practice;

import java.util.*;
import javax.swing.JOptionPane;

public class Second {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Введите свое имя");
        JOptionPane.showMessageDialog(null, "Првиет "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Введите ваш возраст"));
        JOptionPane.showMessageDialog(null, "Вам "+age+" лет");

        int height = Integer.parseInt(JOptionPane.showInputDialog("Введите ваш рост"));
        JOptionPane.showMessageDialog(null, "Вау! Ваш рост состовляет "+height+" см");

    }
}
