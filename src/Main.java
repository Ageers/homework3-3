import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(((i + j) % 2 == 0 ? '#' : '.'));
            }
            System.out.println();
        }


        // 8.5 zlatopolsky
        int sum = 0;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                sum = i + j;
                System.out.print(" " + i + " + " + j + " = " + sum + "   ");
            }
            System.out.println();
        }

        */

        // 8.8

        int pows = 1;
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                pows = i * j;
                System.out.print(" " + i + " X " + j + " = " + pows + "   ");
            }
            System.out.println();
        }


    }
}