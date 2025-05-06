package TallerJava7Metodos;

import java.util.Scanner;

public class TallerJava7Metodos {
    //---------------Conversión de Unidades---------------------
    public static double conversionCen (double numero){
        int centimetro = (int) (numero * 100);
        return centimetro;
    }
    public static double conversionLibra (double numero){
        double libra = numero * 2.205;
        return libra;
    }
    public static double conversionFahr (double numero){
        double fahrenheit = (numero * 9/5) + 32;
        return fahrenheit;
    }
    public static void resultados (){
        double numero = 14;
        System.out.println("Conversion a centimetros: " + conversionCen(numero));
        System.out.println("Conversion a libras: " + conversionLibra(numero));
        System.out.println("Conversion a fahrenheit: " + conversionFahr(numero));
    }
    // -----------------Calificaciones------------------------
    public static String calificaciones (int nota1, int nota2, int nota3){
        double promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 60){
            return "El estudiante aprobó";
        }else {
            return "El estudiante reprobó";
        }
    }
    public static void resultadoNotas (){
        int nota1 = 50; int nota2 = 50; int nota3 = 20;
        System.out.println("resultado: " + calificaciones(nota1, nota2, nota3));
    }
    //------------------Calculadora---------------------------
    public static int suma (int num1, int num2){
        return num1 + num2;
    }
    public static int resta (int num1, int num2){
        return num1 - num2;
    }
    public static int mult (int num1, int num2){
        return num1 * num2;
    }
    public static double div (int num1, int num2){
        if (num2 == 0){
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return (double) num1 / num2;
    }
    public static double potencia (int num1, int num2){
        return Math.pow(num1, num2);
    }
    public static void operacion (){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int num1; int num2;

        do {
            System.out.println("Que deseas calcular:");
            System.out.println("1. suma");
            System.out.println("2. resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. division");
            System.out.println("5. potencia");
            System.out.println("6. salir");
            opcion = scanner.nextInt();
            if (opcion >= 1 && opcion <=5){
                System.out.println("Digita el primer numero:");
                num1 = scanner.nextInt();
                System.out.println("Digita el segundo numero:");
                num2 = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("el resultado de la suma es: " + suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("el resultado de la resta es: " + resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("el resultado de la multiplicación es: " + mult(num1, num2));
                        break;
                    case 4:
                        System.out.println("el resultado de la división es: " + div(num1, num2));
                        break;
                    case 5:
                        System.out.println("el resultado de la potencia es: " + potencia(num1, num2));
                        break;
                }
            } else if (opcion == 6) {
                System.out.println("Gracias por usar la calculadora");
            } else {
                System.out.println("Opcion invalida");
            }
        }while (opcion != 6);
        scanner.close();
    }
}
