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
        Ingresar valores de entrada con Scanner y mostrar los valores en salida con println()

        Scanner scanner = new Scanner(System.in);
        int miIntegral1 = scanner.nextInt();
        int miIntegral2 = scanner.nextInt();
        int miIntegral3 = scanner.nextInt();
        scanner.close();

        System.out.println(miIntegral1);
        System.out.println(miIntegral2);
        System.out.println(miIntegral3);
         */

        /*
        Problem 03: Java If-Else
        Usar el condicional IF / ELSE para determinar si un valor es par o impar y dar un mensaje u otro.

        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        scanner.close();

        if (myNumber >= 1 && myNumber <= 100) {
            if (myNumber % 2 != 0) {
                System.out.println("Weird");
            }
            else {
                if(myNumber >= 6 && myNumber <=20){
                    System.out.println("Weird");
                }
                else {
                    System.out.println("Not Weird");
                }
            }
        }
        else{
            System.out.println("El número debe ser mayor a 1 y menor a 100");
        }
         */

        /*
        Problem 04: Java Stdin and Stdout II
        Leer un int, un double y un string y sacarlos con System.out.println()
        HAY UN DETALLE IMPORTANTE CON SCANNER.NETXLINE();
        */

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // IMPORTANTE!!!!!!!!!!!!!!!!!!
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);

    }
}
