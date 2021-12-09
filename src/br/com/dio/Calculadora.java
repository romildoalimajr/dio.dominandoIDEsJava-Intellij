package br.com.dio;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = tec.nextInt();
        System.out.println("Digite o segundo valor.: ");
        b = tec.nextInt();

        int somar = somar(a,b);
        int subtrair = subtrair(a,b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multiplicar: " + multiplicar);
        System.out.println("dividr: " + dividir);
    }
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }


}
