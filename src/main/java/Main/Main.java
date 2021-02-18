package Main;

import java.util.ArrayList;
import java.util.List;

import Utils.CalculadoraCompleja;
import Utils.CalculadoraSimple;

public class Main {

	public static void main(String[] args) {
		List<Integer> listaTest = new ArrayList<Integer>();
		
		//Con esto podemos generar 5 numeros al azar en un rango de 1000 a 20000
		for(int i=0; i<5; i++) {
			int n = (int) (Math.random() * (20000 + 1 - 1000)) +1000;
			listaTest.add(n);
		}
		System.out.println("------------------------------------------------");
		System.out.println("Desmostracion Calculadora de Comisiones de Venta");
		System.out.println("------------------------------------------------");
		System.out.println("");
		System.out.println("Tomando 5 montos de venta aleatorios...");
		System.out.println(listaTest);
		System.out.println("");
		
		CalculadoraSimple calculadoraSimple = new CalculadoraSimple();
		System.out.println("Descuento con Algoritmo Simple: "+calculadoraSimple.calcula(listaTest));
		
		CalculadoraCompleja calculadoraCompleja = new CalculadoraCompleja();
		System.out.println("Descuento con Algoritmo Complejo: "+calculadoraCompleja.calcula(listaTest));
	}
}