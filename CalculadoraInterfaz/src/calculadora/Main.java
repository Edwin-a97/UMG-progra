package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new CalculadoraImpl();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Suma: " + calc.sumar(a, b));
        System.out.println("Resta: " + calc.restar(a, b));
        System.out.println("Multiplicación: " + calc.multiplicar(a, b));

        try {
            System.out.println("División: " + calc.dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
