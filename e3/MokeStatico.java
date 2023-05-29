import org.junit.Test;
import org.junit.runner.RunWith;
import org,powermock.core.classloader.MochitoAnnotations.PrepareForTest;
import org.powermock.modules.junit4.powerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.powermock.api.mockito.powerMokito.mockStatic;
import static org.powermock.api.mockito,powerMokito.when;

@RunWith(powerMockRunner.class)
@PrepareForTest(Aerolinea.class)
public class Aerolinea{

    @Test
    public void reservaVuelo_ExistenSuficientesPasajes_MensajeCorrecto()throws Exeption{
        mockStatic(Aerolinea.class);
        when (Aerolinea.existenPasajes(anyString(),anyInt())).thenReturn(true);
        when(Aerolinea.getDay(anyInt(),anyInt(),anyInt())).thenReturn("Lunes");

        String destino ="Ciudad de destino";
        int dia= 29:
        int mes = 5;
        int gestion=2023;

        String resultado=aerolineaMock.reservaVuelo(destino,dia,mes,gestion);

        assertEquals("El dia lunes existen NUMERO_PASAJE pasajes para ciudad de destino ", resultado);

    }
    @Test
    public void reservaVuelo_NoExistenSuficientesPasajes_MensajeCorrecto()throws Exeption{
        mockStatic(Aerolinea.class);
        when (Aerolinea.existenPasajes(anyString(),anyInt())).thenReturn(false);
        when(Aerolinea.getDay(anyInt(),anyInt(),anyInt())).thenReturn("Martes");

        String destino= "otro destino";
        int dia =15;
        int mes = 4;
        int gestion=2023;

        String resultado=aerolineaMock.reservaVuelo(destino,dia,mes,gestion);

        assertEquals("No existen suficientes pasajes para  otro destino ", resultado);

    }
}


