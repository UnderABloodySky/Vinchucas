package criterio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;



public class TestBuscador {
	private Seeker buscador;
	private List<Muestra> muestras;
	
	private ValorLogico spyValorLogico;
	private OperacionLogica spyOperacionLogica;
	
	
	@Before
	public void setUp() {
		buscador = new Seeker();
		muestras = new ArrayList<Muestra>();
		
		spyValorLogico = mock(ValorLogico.class);
		spyOperacionLogica = mock(OperacionLogica.class);
	
		stubMuestra0 = mock(Muestra.class); 
		stubMuestra1 = mock(Muestra.class);
	}

	@Test
	public void testSeDelegaLaBusquedaDeseadaEnElValorLogico() {
		buscador.seekIn(muestras, spyValorLogico);
		verify(spyValorLogico).getValor(stubMuestra0);
		verify(spyValorLogico).getValor(stubMuestra1);
	}
	
	@Test
	public void testSeDelegaLaBusquedaDeseadaEnLaValorLogico() {
		buscador.seekIn(eventos, spyOperacionLogica);
		verify(spyValorLogico).getValor(stubMuestra0);
		verify(spyValorLogico).getValor(stubMuestra1);
	}
}
