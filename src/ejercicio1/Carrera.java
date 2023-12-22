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
		//agregar
		public void agregarCorredor(Corredor c) {
			corredores[numCorredor] = c;
			numCorredor++;
		}
		
		//Mostrar 
		public void mostrarListaCorredores() {
			for (int i = 0; i < numCorredor; i++) {
				if(corredores[i]!=null) {
				System.out.println(corredores[i]);
				
				}
				
			}
		}
		
		//Buscar por dorsal 
		public int findBydorsal (int dorsal) {
			int i = 0;
			boolean encontrado = false;
			while (i<numCorredor&& !encontrado) {
				Corredor delista = corredores[i];
				if(delista.getDorsal()==dorsal) {
					encontrado = true;
				}else {
					i++;
				}
				
			}if(encontrado) {
				return i;
			}else {
				return -1;
			}
		}
		//Case 3 metodo para pasar de minutos a segundos 
		public double calcularTiempo(int dorsal) {
			int  index = findBydorsal(dorsal);
			int segundos = 60;
			double tiempoSegundos = corredores[index].getTiempo()* segundos;
			return tiempoSegundos;
			
		}
	//Buscar por categoria 
		public Corredor[] findByCategoria(int categoria) {
			int index = 0;
			Corredor[] listaCategoria = new Corredor[numCorredor];
		while(index<numCorredor) {
			if(corredores[index].getCategoria()==categoria) {
				listaCategoria[index] =corredores[index]; 
			}
			index++;
		}
			return listaCategoria;
		}
		//Mostar lista Este método sirve para mostarr cualquier lista que se le pase como paramentro 
		public void mostrarLista(Corredor[] lista  ) {
			for (int i = 0; i < lista.length; i++) {
				if(lista[i]!=null) {
					System.out.println(lista[i]);
				}
			}
			
			}
		public void modificarTiempo(int dorsal,int tiempoNuevo) {
			for (int i = 0; i < corredores.length; i++) {
				
			}
		}
}
