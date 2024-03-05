import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Problem 01: Welcome to Java!
        Mostrar mensaje por consola
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
        */

        /*
        Problem 02: Java Stdin and Stdout I
        Ingresar valores de entrada con Scanner y mostrar los valores en salida con println()*/

        Scanner scanner = new Scanner(System.in);
        int miIntegral1 = scanner.nextInt();
        int miIntegral2 = scanner.nextInt();
        int miIntegral3 = scanner.nextInt();
        scanner.close();

        System.out.println(miIntegral1);
        System.out.println(miIntegral2);
        System.out.println(miIntegral3);
    }
}
