package Ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura: ");
        int temperatura = sc.nextInt();
        if (temperatura < 2){
            System.out.println("Riesgo de hielo");
        } else if (temperatura >= 2 && temperatura < 15){
            System.out.println("Hace frío");
        } else if (temperatura >= 15 && temperatura < 30){
            System.out.println("Buena temperatura");
        } else if (temperatura >= 30){
            System.out.println("Demasiado calor");
        }
    }
}
