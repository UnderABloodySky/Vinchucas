package criterio;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class  TestCriterioPorTipoDeInsecto  {
	private String vinchuca, hormiga;
	private CriterioPoNivelDeValidacion nivelDeValidacion;
	
		@Before
		public void setUp() {
			vinchuca = new String("vinchuca");
			hormiga = new String("hormiga");

			muestra = mock(Muestra.class)
			
			tipoDeInsecto = new CriterioPorTipoDeInsecto(vinchuca); 
		}
		
		
		@Test
		public void testLaMuestraDeVinchucaCumpleElCriterio() {
			when(muestra.getTipoDeVinchuca()).thenReturn(vinchuca)		
			assertTrue(nivelDeValidacion.cumpleCriterio(muestra));
		}
		
		@Test
		public void testLaMuestraDeHormigaNoCumpleElCriterio() {
			when(muestra.getTipoDeVinchuca()).thenReturn(hormiga)		
			assertFalse(nivelDeValidacion.cumpleCriterio(muestra));
		}
}