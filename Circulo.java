package Taller1;

import java.util.Scanner;

public class Circulo {
	public static void main(String[] args) {
		double x;
		Scanner entrada = new Scanner(System.in);
	    System.out.println("Ingrese radio del circulo:");
	    x = entrada.nextDouble();
	    System.out.println("El area del circulo es: " + (Math.PI*Math.pow(x,2)));
	    System.out.println("La longitud de circuferencia es: " + (Math.PI*2*x));
	}
}
