package ushtrime;

import java.util.Scanner;

public class ushtrime_3 {
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosini 2 numra decimal me vlere prej 0 deri 1000");
        System.out.print("Numri i pare: ");
        a = input.nextDouble();
        System.out.print("Numri i dyte: ");
        b = input.nextDouble();

        if (a < 0 || a > 1000 || b < 0 || b > 1000) {
            System.out.println("Vlerat jane dhene gabim");
            System.exit(0);
        }

        System.out.println("Zgjidheni operacionin aritmetik: + , - , * , / , %");
        String operacioni = input.next();

        switch (operacioni) {
            case "+":
                System.out.println("Operacionit aritmetik + ne mes " + a + " dhe " + b + " ka kete rezultat: " + (a + b));
                break;
            case "-":
                System.out.println("Operacionit aritmetik - ne mes " + a + " dhe " + b + " ka kete rezultat: " + (a - b));
                break;
            case "*":
                System.out.println("Operacionit aritmetik * ne mes " + a + " dhe " + b + " ka kete rezultat: " + (a * b));
                break;
            case "/":
                System.out.println("Operacionit aritmetik / ne mes " + a + " dhe " + b + " ka kete rezultat: " + (a / b));
                break;
            case "%":
                System.out.println("Operacionit aritmetik % ne mes " + a + " dhe " + b + " ka kete rezultat: " + (a % b));
                break;
            default:
                System.out.println("operacioni aritmetik është JO VALID");
        }
    }
}
