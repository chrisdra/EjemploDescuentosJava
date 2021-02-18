package Utils;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraCompleja implements CalculadoraComisiones{

	public Integer totalVenta() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer calcula(List<Integer> lista) {
		
		List<Integer> nuevaLista = new ArrayList<Integer>();
		int montoTotal = lista.stream().reduce(0, Integer::sum);
		boolean plus = false;
		
		if(montoTotal > 50000) plus = true;
		double factor = 0.05;
		
		for(int venta: lista) {
			if(venta >= 5000 && venta <= 1000) factor = 0.07;
			else if (venta > 10000) factor = 0.08;
			nuevaLista.add((int) Math.round(venta*factor));
		}
		
		if (plus) return (int) Math.round(nuevaLista.stream().reduce(0, Integer::sum)*1.01);
		else return nuevaLista.stream().reduce(0, Integer::sum);
	}
}
