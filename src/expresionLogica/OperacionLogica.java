package expresionLogica;

import java.util.List;

import criterio.CriterioDeBusqueda;

public abstract class OperacionLogica implements ExpresionLogica{
	private ExpresionLogica expresionIzq;
	private ExpresionLogica expresionDer;
	
		public OperacionLogica(ExpresionLogica expresionIzquierda, ExpresionLogica expresionDerecha) {
			this.setExpresionIzquierda(expresionIzquierda);
			this.setExpresionDerecha(expresionDerecha);
		}
	
			public ExpresionLogica getExpresionIzquierda() {
				return expresionIzq;
			}
			
			public ExpresionLogica getExpresionDerecha() {
				return expresionDer;
			}
			
			public void setExpresionIzquierda(ExpresionLogica _expresionIzquierda) {
				expresionIzq = _expresionIzquierda;
			}
			
			public void setExpresionDerecha(ExpresionLogica _expresionDerecha) {
				expresionDer = _expresionDerecha;
			}
			
			@Override
			public abstract Boolean getValor(Muestra _muestra);
}