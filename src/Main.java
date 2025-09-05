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
*/

        //

        for (int i = 0; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                System.out.print(i+j + "   ");
            }
            System.out.println();
        }
    }
}