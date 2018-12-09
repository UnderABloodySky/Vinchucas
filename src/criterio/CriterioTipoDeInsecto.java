package criterio;

import java.util.List;
import java.util.stream.Collectors;


public class CriterioTipoDeInsecto extends CriterioDeBusqueda{
	private String insectoDeInteres;
	
		public CriterioTipoDeInsecto(String _insectoDeInteres){
			insectoDeInteres = _insectoDeInteres; //Sin setter, no quiero que perdure en  el tiempo
		}

			@Override
			public boolean cumpleCriterio(Muestra _muestra) {
				return _muestra.getTipoDeVinchuca().equals(insectoDeInteres);
			}

}