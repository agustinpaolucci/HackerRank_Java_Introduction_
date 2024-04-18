import java.sql.SQLOutput;
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


        Scanner scr = new Scanner(System.in);
        int t = scr.nextInt();
        if(t >= 0 && t<=500) {
            for(int i=0; i<t; i++){
                double suma = 0;
                int a = scr.nextInt();
                int b = scr.nextInt();
                int n = scr.nextInt();
                if(a >= 0 && a <= 50 && b >=0 && b<=50 && n>=1 && n<=15) {
                    for (int x = 0; x < n; x++) {
                        suma = suma + (Math.pow(2, x) * b);
                        System.out.print(a + (int) (suma) + " ");
                    }
                }
                System.out.print("\n"); // Ojo la salida. Tiene que ser println pero con salto de linea.
            }
        }
        scr.close();
        */

        /*
        Problem 08: Java Datatypes

        Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

        Java tiene 8 tipos de datos primitivos;
        char --CARACTER
        boolean -- BOOLEANO
        byte -- INTEGRAL  8 BITS   -- DESDE -128 hasta 127.
        short -- INTEGRAL  16 BITS -- DESDE -32768 hasta 32767.
        int -- INTEGRAL  32 BITS   -- DESDE -2 a la 31 hasta (2 elevado a la 31) menos 1.
        long -- INTEGRAL  64 BITS  -- DESDE -2 a la 63 hasta (2 elevado a la 63) menos 1.
        float -- DECIMAL
        double -- DECIMAL


        Scanner scr = new Scanner(System.in);
        int cantidadCasos = scr.nextInt();

        for(int i=0; i<cantidadCasos; i++)
        {
            try
            {
                long numero = scr.nextLong();
                System.out.println(numero +" can be fitted in:");
                if(numero >= -128 && numero <= 127){
                    System.out.println("* byte");
                }
                if(numero >= -32768 && numero <= 32767){
                    System.out.println("* short");
                }
                if(numero >= (Math.pow(-2,31)) && numero <= (Math.pow(2,31)-1)){
                    System.out.println("* int");
                }
                if(numero >= (Math.pow(-2,63)) && numero <= (Math.pow(2,63)-1)){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scr.next()+" can't be fitted anywhere.");
            }
        }
        */


        /*
        Problem 09: Java End-of-file.
        Pegar este texto y que por cada linea (que son cantidad n) lo imprima poniendole un numero adelante.
        Hello world
        I am a file
        Read me until end-of-file.

        Scanner scanner = new Scanner(System.in);
        int lineNumber = 1;
        while (scanner.hasNext()){
            System.out.println(lineNumber + " " + scanner.nextLine());
            lineNumber++;
        }
        scanner.close();
        */

        /*
        Problem 10: Java Static Initializer Block

        BLOQUE STATICO >>> con el bloque en hackerrank funciona.

        private static int B;
        private static int H;
        private static boolean flag;

        static{
            Scanner scanner = new Scanner(System.in);
            B = scanner.nextInt();
            H = scanner.nextInt();
            scanner.close();

            // BLOQUE HACKERRANCK
            if(B > 0 && H > 0){
                flag = true;
            }
            else{
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
         */

        /*
        Problema 11 : Java Int to String
        */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String s = Integer.toString(n); // Castea un int a un string.

//        if (n == Integer.parseInt(s)) {
//            System.out.println("Good job");
//        } else {
//            System.out.println("Wrong answer.");
//        }
        // Lectura del IF:
        // si n que es int, es IGUAL, al convertir a S (que es string) a INT entonces... Good job
        // VOLVER A EMPEZAR
    }
}