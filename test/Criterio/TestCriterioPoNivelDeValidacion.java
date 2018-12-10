package criterio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class  TestCriterioPorNivelDeValidacion  {
	private String alto, medio, bajo;
	private CriterioPoNivelDeValidacion nivelDeValidacion;
	
		@Before
		public void setUp() {
			alto = new String("alto");
			medio = new String("medio");
			bajo = new String("bajo");
			

			muestra = mock(Muestra.class)
			
			nivelDeValidacion = new CriterioPoNivelDeValidacion(alto); 
		}
		
		
		@Test
		public void testLaMuestraDeNivelDeValidacionAltoCumpleElCriterio() {
			when(muestra.getNivelDevalidacion()).thenReturn(alto)		
			assertTrue(nivelDeValidacion.cumpleCriterio(muestra));
		}
		
		@Test
		public void testLaMuestraDeNivelDeValidacionMedioNoCumpleElCriterio() {
			when(muestra.getNivelDevalidacion()).thenReturn(medio)		
			assertFalse(nivelDeValidacion.cumpleCriterio(muestra));
		}

		@Test
		public void testLaMuestraDeNivelDeValidacionBajoNoCumpleElCriterio() {
			when(muestra.getNivelDevalidacion()).thenReturn(bajo)		
			assertFalse(nivelDeValidacion.cumpleCriterio(muestra));
		}
}