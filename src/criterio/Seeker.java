package criterio;

import java.util.List;

//Faltan imports

public class Seeker {
	
		public Seeker() {
		}
		
		public List<Muestra> seekIN(List<Muestra> muestras, ExpresionLogica expresion) {
			List<Muestra> resultado = new ArrayList<Muestra>();
				for(Muestra muestra : muestras){
					if(expresion.getValor(muestra)) {
						resultado.add(muestra);
					}
				}
			return resultado;
		}
}
