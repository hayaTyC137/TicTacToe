package Practice;

import java.util.Vector;

public class Eight {
    public static void main(String[] args) {
        String heading1 ="Exam_Name";
        String heading2 = "Exam_Grade";
        String divider = "-----------------------------------";

        String course1 = "Java";
        String course2 = "PHP";
        String course3 = "VB NET";

        String grade1 = "5";
        String grade2 = "4";
        String grade3 = "3";

        System.out.println("");
        System.out.printf("%-15s %15s %n", heading1, heading2);
        System.out.println(divider);

        System.out.printf("%-15s %10s %n", course1, grade1);
        System.out.printf("%-15s %10s %n", course2, grade2);
        System.out.printf("%-15s %10s %n", course3, grade3);

        System.out.println(divider);
        System.out.println("");
    }
}
