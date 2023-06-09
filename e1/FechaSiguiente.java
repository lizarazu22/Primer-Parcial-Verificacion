import org.junit.jupiter.api.Test;
import org junit.jupiter.params.ParametrizedTest;
import org,junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertion.assertEquals;

public class FechaTest{

    @ParameterizedTest
    @CsvSource({
        "31,12,2023, 01/01/2024",
        "31,12,2023, 01/Enero/2024"
    }

    )
    public void testNextDay(int dia ,int mes , int ano, Strong expected){
        Fecha fecha = new Fecha();
        String resultado = fecha.nextDay(dia, mes,ano);
        assertEquals(expected, resultado);
    }
}