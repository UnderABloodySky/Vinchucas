 package criterio;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

//Falta import 

public class CriterioPorFechaDeUltimaVerificacion extends CriterioPorFecha{
	
		public CriterioPorFechaDeUltimaVerificacion(Date _fecha){
			super(_fecha)
		}

		protected Date fechaDeMuestra(Muestra muestra){
			return muestra.getFechaDeUltimaVerificacion()
		}
}
