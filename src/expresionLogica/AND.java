package expresionLogica;

import java.util.List;

public class AND extends OperacionLogica {

	public AND(ExpresionLogica expresionIzquierda, ExpresionLogica expresionDerecha) {
		super(expresionIzquierda, expresionDerecha);
	}

		@Override
		public Boolean getValor(Muestra muestra) {
			return this.getExpresionIzquierda().getValor(muestra) && this.getExpresionDerecha().getValor(muestra));
		}

}
