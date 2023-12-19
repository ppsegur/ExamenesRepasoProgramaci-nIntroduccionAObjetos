package ejercicio1;

import java.util.Arrays;

public class Carrera {
	/**
	 * @atributos de la clase carrera
	 */
		private int numCorredor;
		private Corredor[] corredores;
		
		/**
		 * Constructor completo
		 * @param numCorredor
		 * @param corredores
		 */
		public Carrera(int numCorredor, Corredor[] corredores) {
			super();
			this.numCorredor = numCorredor;
			this.corredores = corredores;
		}
		//Constructor vacio
		public Carrera() {
			
		}
		//Getters and setters
		public int getNumCorredor() {
			return numCorredor;
		}
		public void setNumCorredor(int numCorredor) {
			this.numCorredor = numCorredor;
		}
		public Corredor[] getCorredores() {
			return corredores;
		}
		public void setCorredores(Corredor[] corredores) {
			this.corredores = corredores;
		}
		//ToString
		@Override
		public String toString() {
			return "Carrera [numCorredor=" + numCorredor + ", corredores=" + Arrays.toString(corredores) + "]";
		}
		public void agregarCorredor(Corredor c) {
			corredores[numCorredor] = c;
			numCorredor++;
		}
		
	
}
