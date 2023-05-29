import org.junit.jupiter.api.Test;
import org junit.jupiter.params.ParametrizedTest;
import org,junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertion.assertEquals;

public class FechaTest{
    public void testNextDay(int dia ,int mes , int ano, Strong expected){
        Fecha fecha = new Fecha();
        String resultado = fecha.nextDay(dia, mes,ano);
        assertEquals(expected, resultado);
    }
}