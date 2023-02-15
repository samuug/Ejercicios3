package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2){
            System.out.println("Riesgo de hielo");
        }
    }
}
