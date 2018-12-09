package expresionLogica;

import java.util.List;

import criterio.CriterioDeBusqueda;

public class ValorLogico implements ExpresionLogica{
	//Adapter de criterios de busqueda.
	private CriterioDeBusqueda criterioDeBusqueda;
	
		public ValorLogico(CriterioDeBusqueda _criterio) {
			this.setCriterio(_criterio);
		}
		
			@Override
			public Boolean getValor(Muestra muestra) {
				return criterioDeBusqueda.cumpleCriterio(muestra);
			}
			
			public void setCriterio(CriterioDeBusqueda _criterio) {
				criterioDeBusqueda = _criterio;
			}
			
			public CriterioDeBusqueda getCriterio() {
				return criterioDeBusqueda;
			}
	

}
