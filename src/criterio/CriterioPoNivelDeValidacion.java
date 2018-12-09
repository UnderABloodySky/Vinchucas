package criterio;

import java.util.List;
import java.util.stream.Collectors;

//Falta import de muestra

public class CriterioPoNivelDeValidacion extends CriterioDeBusqueda{
	private String nivelDeInteres;
	
		public CriterioPoNivelDeValidacion(String _nivelDeInteres){
			nivelDeInteres = _nivelDeInteres; //Sin setter, no quiero que perdure en  el tiempo
		}

			@Override
			public boolean cumpleCriterio(Muestra _muestra) {
				return _muestra.nivelDeValidacion().equals(nivelDeInteres);
			}

}