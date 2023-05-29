import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito,MochitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.When;


public class AerolineaTest{

    private Aerolinea aerolinea ;
    
    public Aerolinea(){
        MochitoAnnotations.initMocks(this);

    }
    public void reservaVuelo_ExistenSuficientesPasajes_MensajeCorrecto(){
        When(aerolineaMock.existenPasajes(anyString(),anyInt())).thenReturn(true);
        When(aerolineaMock.getDay(anyInt(),anyInt(),anyInt())).thenReturn("Lunes");

        String destino ="Ciudad de destino";
        int dia= 29:
        int mes = 5;
        int gestion=2023;

        String resultado=aerolineaMock.reservaVuelo(destino,dia,mes,gestion);

        assertEquals("El dia lunes existen NUMERO_PASAJE pasajes para ciudad de destino ", resultado);

    }

    @Test
    public void reservaVuelo_NoExistenSuficientesPasajes_MensajeCorrecto(){
        When(aerolineaMock.existenPasajes(anyString(), anyInt())).thenReturn(false);
        When(aerolineaMock.getDay(anyInt(),anyInt(),anyInt()))thenReturn("Martes");

        String destino= "otro destino";
        int dia =15;
        int mes = 4;
        int gestion=2023;

        String resultado= aerolineaMock.reservaVuelo(destino,dia,mes,gestion);

        assertEquals("No existen suficientes pasajes para otro destino", resultado);
    }
}