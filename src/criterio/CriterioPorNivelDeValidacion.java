package criterio;

//Falta import de muestra

public class CriterioPorNivelDeValidacion extends CriterioDeBusqueda{
	private String nivelDeInteres;
	
		public CriterioPorNivelDeValidacion(String _nivelDeInteres){
			nivelDeInteres = _nivelDeInteres; //Sin setter, no quiero que perdure en  el tiempo
		}

			@Override
			public boolean cumpleCriterio(Muestra _muestra) {
				return _muestra.getNivelDeValidacion().equals(nivelDeInteres);
			}

}