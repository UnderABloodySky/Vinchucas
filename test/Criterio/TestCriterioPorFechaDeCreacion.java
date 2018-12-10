lo'¡¡package criterio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class  TestCriterioPorFechaDeCreacion  {
	
	private CriterioPorFechaDeCreacion criterioSUT;
	private Date fechaIndicada, fechaCualquiera;
	private Muestra muestra;

		@Before
		public void setUp() {
			fechaIndicada = new Date(14,4,1987);
			fechaCualquiera = new Date(6,6,6);
			
			muestra = mock(Muestra.class);
			
			criterioSUT = new CriterioPorFechaDeCreacion(fecha);
		}
		
		@Test
		public void testLaMuestraDeLaFechaIndicadaCumpleElCriterio() {
			when(muestra.getFechaDeCreacion()).thenReturn(fechaIndicada)		
			assertTrue(nivelDeValidacion.cumpleCriterio(muestra));
		}
		
		@Test
		public void testLaMuestraDeLaFechaCualquieraNoCumpleElCriterio() {
			when(muestra.getFechaDeCreacion()).thenReturn(fechaCualquiera)		
			assertFalse(nivelDeValidacion.cumpleCriterio(muestra));
		}
}