package criterio;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public abstract class CriterioPorFecha extends CriterioDeBusqueda{
	protected Date fechaInteres;
	
		public CriterioPorFecha(Date _fecha){
			fechaInteres = _fecha; //Sin setter, no quiero que perdure en  el tiempo
		}

			//Template
			@Override
			public boolean cumpleCriterio(Muestra muestra) {
				n = new Integer(this.fechaDeMuestra(muestra).compareTo(fechaInteres))
				return n.equals(new Integer(0))
			}	
						
			//Hook
			protected abstract Date fechaDeMuestra(Muestra muestra)
}