package softmath;

import java.util.Scanner;

public class Operadores {

    public static void menu(){
        System.out.println("**********CALCULADORA SOFKA************");
        System.out.println("1 - SUMAR \n2 - MULTIPLICAR \n3 - LOGARITMO \n4 - RAÍZ");
        System.out.println("5 - POTENCI \n6 - DIVISIÓN \n7 - RESTA \n8 - COSENO");
        System.out.println("9 - FACTORIAL \n10 - SENO \n11 - TERMINAR");
        System.out.println();
    }

    public static double crearPotencia(double base, double exponente ){
        return Math.pow(base,exponente);
    }

}
