package Utils;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraSimple implements CalculadoraComisiones {

	@Override
	public Integer totalVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer calcula(List<Integer> lista) {
		
		//Esto permitira que si alguno de los 5 numeros aleatorios 
		//sea superior o igual a 10.000 obtendra el 10% de esos numeros. 
		//Si el numeros es menor a 10.000 sera de un 5%
		int montoTotal = lista.stream().reduce(0, Integer::sum);
		
		if(montoTotal > 10000) return (int) Math.round(0.1*montoTotal);
		else return (int) Math.round(0.05*montoTotal);
	}

}
