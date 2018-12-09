package criterio;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class CriterioPorFechaDeCreacion extends CriterioDeBusqueda{
	
		public CriterioPorFechaDeCreacion(Date _fecha){
			super(_fecha)
		}

		protected Date fechaDeMuestra(Muestra muestra){
			return muestra.getFechaDeCreacion()
		}

}
