package Ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tipo de carne: (vacuno o cordero)");
        String carne = sc.nextLine();
        System.out.println("Introduce el modo de coccion: (casi cruda, al punto o bien hecha)");
        String coccion = sc.nextLine();
        System.out.println("Introduce el peso de la carne: ");
        int peso = sc.nextInt();
        if (carne.equals("vacuno")){
            if (coccion.equals("casi cruda")){
                System.out.println("Tiempo de coccion: " + (peso*(10*60)/500)+ " segundos");
            } else if (coccion.equals("al punto")){
                System.out.println("Tiempo de coccion: " + (peso*(17*60)/500)+ " segundos");
            } else if (coccion.equals("bien hecha")){
                System.out.println("Tiempo de coccion: " + (peso*(25*60)/500)+ " segundos");
            }
        } else if (carne.equals("cordero")){
            if (coccion.equals("casi cruda")){
                System.out.println("Tiempo de coccion: " + (peso*(15*60)/400)+ " segundos");
            } else if (coccion.equals("al punto")){
                System.out.println("Tiempo de coccion: " + (peso*(25*60)/400)+ " segundos");
            } else if (coccion.equals("bien hecha")){
                System.out.println("Tiempo de coccion: " + (peso*(40*60)/400)+ " segundos");
            }
        } else {
            System.out.println("Carne no valida");
        }

    }
}
