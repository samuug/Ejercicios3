package Ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {
    public static double calcularSalarioBruto(int horas, double tarifa){
        double salarioBruto = 0;
        int horas50= (horas<=180?horas-169:11);
        int horas60= horas-180;
        if (horas<=169){
            salarioBruto = horas*tarifa;
            System.out.println(salarioBruto+"€ ("+horas+" horas sin incremento");
        } else if (horas>169 && horas<=180){
            salarioBruto = (169*tarifa)+(horas50*(tarifa+(tarifa*50/100)));
            System.out.println(salarioBruto+"€ (169 horas sin incremento, "+horas50+" horas con incremento del 50%");
        } else if (horas>180){
            salarioBruto = (169*tarifa)+(horas50*(tarifa+(tarifa*50/100)))+(horas60*(tarifa+(tarifa*60/100)));
            System.out.println(salarioBruto+"€ (169 horas sin incremento, "+horas50+" horas con incremento del 50%, "+horas60+" horas con incremento del 60%)");

        }
        return salarioBruto;
    }

    public static int calcularPrimaFamiliar(int hijos){
        int primaFamiliar = 0;
        if (hijos==1){
            primaFamiliar = 20;
        } else if (hijos==2){
            primaFamiliar = 50;
        } else if (hijos>=3){
            primaFamiliar = 70+((hijos-2)*20);
        }
        return primaFamiliar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Apellido de la persona: ");
        String apellido = sc.nextLine();
        System.out.println("Nombre de la persona: ");
        String nombre = sc.nextLine();
        System.out.println("Puesto de trabajo: ");
        System.out.println("1. Agente de servicio");
        System.out.println("2. Empleado de oficina");
        System.out.println("3. Directivo");
        int puesto = sc.nextInt();
        System.out.println("Horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("Tarifa horaria: ");
        double tarifa = sc.nextDouble();
        System.out.println("Número de hijos: ");
        int hijos = sc.nextInt();
        System.out.println("Nómina de " + nombre + " " + apellido);
        switch (puesto){
            case 1:
                System.out.println("Puesto: Agente de servicio");
                break;
            case 2:
                System.out.println("Puesto: Empleado de oficina");
                break;
            case 3:
                System.out.println("Puesto: Directivo");
                break;
        }
        System.out.println("Salario bruto:");
        double salarioBruto= calcularSalarioBruto(horas, tarifa);
        System.out.println("Calculo de deducciones");
        System.out.println("* Contribución para el pago de la deuda social y contingencias comunes imponible");
        double cci = Math.round(salarioBruto*(3.49))/100.0;
        System.out.println(salarioBruto+"€ * 3.49% = "+cci+"€");
        System.out.println("* Contribución de contingencias comunes no imponible");
        double ccni = Math.round(salarioBruto*(6.15))/100.0;
        System.out.println(salarioBruto+"€ * 6.15% = "+ccni+"€");
        System.out.println("* Seguro médico");
        double seguroM = Math.round(salarioBruto*(0.95))/100.0;
        System.out.println(salarioBruto+"€ * 0.95% = "+seguroM+"€");
        System.out.println("* Fondos de pensiones");
        double pensionC = Math.round(salarioBruto*(8.44))/100.0;
        System.out.println(salarioBruto+"€ * 8.44% = "+pensionC+"€");
        System.out.println("* Seguro de desempleo");
        double seguroD = Math.round(salarioBruto*(3.05))/100.0;
        System.out.println(salarioBruto+"€ * 3.05% = "+seguroD+"€");
        System.out.println("* Pensión complementaria (Entidad privada)");
        double pensionP = Math.round(salarioBruto*(3.81))/100.0;
        System.out.println(salarioBruto+"€ * 3.81% = "+pensionP+"€");
        System.out.println("* Contribución de jubilación anticipada");
        double jubilacionA = Math.round(salarioBruto*(1.02))/100.0;
        System.out.println(salarioBruto+"€ * 1.02% = "+jubilacionA+"€");
        double deduccionT = Math.round((cci+ccni+seguroM+pensionC+seguroD+pensionP+jubilacionA)*100)/100.0;
        System.out.println("Total deducciones: "+deduccionT+"€");
        System.out.println("Salario neto: "+Math.round((salarioBruto-deduccionT)*100)/100.0+"€");
        System.out.println("Prima familiar: "+calcularPrimaFamiliar(hijos)+"€");
        System.out.println("Salario neto a pagar: "+((salarioBruto-deduccionT)+calcularPrimaFamiliar(hijos))+"€");



    }
}
