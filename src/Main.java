import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        float score = sc.nextFloat();
        int convertInt = (int)score;
        double percentScore = convertInt * 100 / 5.0;

//        int i;

        System.out.println("[ " + title + " ]");
        System.out.println("별점 : " + convertInt + " (" + percentScore + "%)");

//        for (i=1; i<11; i++) {
//            String input = sc.nextLine();
//            System.out.println(i + ". " + input);
//        }
    }
}