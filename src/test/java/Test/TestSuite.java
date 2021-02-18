package Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import Utils.CalculadoraCompleja;
import Utils.CalculadoraSimple;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestSuite {
    CalculadoraCompleja completa = new CalculadoraCompleja();
    CalculadoraSimple simple = new CalculadoraSimple();

    @Test
    public void testCalculadoraSimple(){
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(10);
        lista.add(10);
        lista.add(10);
        lista.add(10);

        int expected = 3;

        assertEquals(expected, simple.calcula(lista), "El resultado debera ser 5");
    }

    @Test
    public void testCalculadoraCompleja(){
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(10);
        lista.add(10);
        lista.add(10);
        lista.add(10);

        int expected = 5;

        assertEquals(expected, completa.calcula(lista), "El resultado debera ser 5");
    }
}
