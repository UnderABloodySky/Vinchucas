package expresionLogica;

import java.util.ArrayList;
import java.util.List;

public class OR extends OperacionLogica {

	public OR(ExpresionLogica expresionIzquierda, ExpresionLogica expresionDerecha) {
		super(expresionIzquierda, expresionDerecha);
	}

		@Override
		public Boolean getValor(Muestra muestra) {
			return this.getExpresionIzquierda().getValor(muestra) || this.getExpresionDerecha().getValor(muestra));	
		} 
		
}
