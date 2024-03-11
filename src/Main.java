import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Main {
    public static void main(String[] args) throws IOException {
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


        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine(); // IMPORTANTE PORQUE DESPUES DE UN NUMERO NEXT LINE NO LO PERMITE.
        String s = scanner.nextLine();
        scanner.close();

        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
        */

        /*
        Problem 05: Java Output Formatting
        Uso del metodo printf con sus modificadotes y flags.
        El método printf saca por consola un string con el formato que queremos.


        System.out.println("================================");
        Scanner scr =new Scanner(System.in);
        for(int i = 0; i<3; i++){
            String str01 = scr.next();
            int num01 = scr.nextInt();
            System.out.printf("%-15s", str01); // (s)string de 15 espacios justificado a la izquierda (-)
            System.out.printf("%03d%n", num01); // (d) int de 3 espacios que si tiene menos ponga cero adelante y salto de lina
        }
        System.out.println("================================");
        */

        /*
        Problem 06: Java Loops I
        Uso de loops para hacer una tabla de multiplicar a partir de un número ingresado.


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N +" x " +i+" = "+(result));
        }
        bufferedReader.close();

         */

        /*
        Problem 07: Java Loops II
        Es crear una secuencia de tipo (a + 2^0 * b), (a + 2^1 * b), (a + 2^2 * b).
        La gracia está en darse cuenta que el valor de a es fijo, y lo que cambia y se hace con un loop
        es sumarle (2^x * b).
        Otro detalle importante es que hay dos ciclos for y no se puede usar la letra i en ambos como condicion de la
        iteracion.
        */

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t >= 0 && t<=500) {
            for(int i=0; i<t; i++){
                double suma = 0;
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if(a >= 0 && a <= 50 && b >=0 && b<=50 && n>=1 && n<=15) {
                    for (int x = 0; x < n; x++) {
                        suma = suma + (Math.pow(2, x) * b);
                        System.out.print(a + (int) (suma) + " ");
                    }
                }
                System.out.print("\n"); // Ojo la salida. Tiene que ser println pero con salto de linea.
            }
        }
        in.close();
    }
}

