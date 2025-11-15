package modulo_01_fundamentos_do_java.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        number = sc.nextInt();

        switch (number){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Number not mapped");
        }
    }
}
