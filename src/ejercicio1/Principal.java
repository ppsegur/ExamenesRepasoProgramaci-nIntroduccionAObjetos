package ejercicio1;

import utilidades.Leer;

public class Principal {
/*1. Desde que dejé de fumar me he enganchado a correr carreras populares y me han pedido en mi pueblo que haga un programa para
gestionar los corredores de esta carrera. Tendremos la clase Corredor, cuyas características son: nombre, apellidos, dorsal (número de
corredor), categoría (un entero para tres posibilidades que son juvenil, senior o veterano) y el tiempo que ha tardado en acabar la carrera
medido en minutos (para no complicar los cálculos tendrá decimales pero no hace falta pasarlo a segundos ni nada de eso, un número
de minutos con decimales, por ejemplo, el tiempo de un corredor puede ser 20.8 minutos).
En la clase Carrera, tendremos como características una lista de Corredores y kilómetros de los que consta.
En ambas calases tendremos los constructores, getters and setters y toString adecuados, además de los métodos propios (que irán todos
en la clase Carrera). Se debe crear una clase principal, con un menú donde se podrán hacer las siguientes cosas. El programa se repetirá
hasta que el usuario quiera. En cada caso del menú se deben mostrar las cosas pedidas, por ejemplo, si se pide buscar algo, debemos
mostrar en el main el resultado de esa búsqueda. También se pueden agregar varios corredores a la lista para hacer las pruebas antes
de empezar el menú.
a) Agregar un nuevo corredor a la lista leyendo los datos por teclado.
b) CalcularTiempoEnSegundos, que simplemente será dividir el tiempo por un factor de conversión (cuando se lea por teclado en el
main, debemos poner 60 para que salgan números razonables y para no complicar los cálculos). El factor de conversión se debe pasar
como parámetro.
c) Buscar y devolver todos los corredores de la categoría veterano.
d) Modificar el tiempo de un corredor por otro leído por teclado buscando el corredor como consideres mejor.
e) Calcular la media de tiempo en minutos por kilómetro de un corredor. Se debe buscar el corredor y dividir su tiempo por el número
de kilómetros de la carrera. Vosotros elegís la forma de buscarlo.
f) Calcular cuánto tiempo han tardado entre todos los corredores de la categoría juvenil.
g) Buscar el corredor que menos ha tardado de todos (consideraremos que no hay dos corredores con el mismo tiempo)*/

	public static void main(String[]args) {
		String nombre, apellidos;
		int dorsal,op, categoria, edad;
		double tiempo;
		int tam = 100;
		int numCorredor = 0;
		Corredor[] corredores = new Corredor[tam];
		 Carrera c = new Carrera(numCorredor,corredores);
		System.out.println("Bienvenido al programa para la gestion del torneo de carreras municipales");
		System.out.println("Contaremos como mucho con 100 corredores");
		 Corredor c1 = new Corredor("Pepe", "Segura", 1,2, 20);
		 Corredor c2 = new Corredor("Rafa", "Hernandez", 2, 1, 10);
		 c.agregarCorredor(c2);
		c.agregarCorredor(c1);
		
		
		do {
			System.out.println("""
								MENU DE CARRERAS
					Pulse 1. Para agregar un corredor
					Pulse 2. Para ver la lista de corredores
					Pulse 3. Para calcular el tiempo en segundo de un corredor 
					Pulsa 4. Para mostrar la lista de corredores de una categorría específica
					Pulsa 5. Para cambiar el timepo de un corredor
					""");
			op = Leer.datoInt();
			 switch (op) {
			case 1:
				System.out.println("Diga el nombre del nuevo corredor");
				nombre = Leer.dato();
				System.out.println("Diga sus apellidos");
				apellidos = Leer.dato();
				System.out.println("Diga su edad ");
				edad = Leer.datoInt();
				if(edad < 18) {
					 categoria = 1;
				}if(edad>18 && edad < 65) {
					categoria = 2;
				}else {
					categoria = 3;
				}
				
				System.out.println("Diga si desea algun dorsal en específico");
				dorsal = Leer.datoInt();
				System.out.println("Diga tiempo en minutos en terminar la maraton ");
				tiempo = Leer.datoDouble();
				Corredor c3 = new Corredor (nombre, apellidos, dorsal, categoria, tiempo);
				
				c.agregarCorredor(c3);
				break;
			case 2:
			c.mostrarListaCorredores();
				break;
			case 3:
				System.out.println("Diga el dorsal del corredor que quiere calcular");
				dorsal = Leer.datoInt();
				System.out.println("Su tiempo en segundos es de: "+c.calcularTiempo(dorsal));		
				
				break;
			case 4:
				System.out.println("Diga de que categoría quiere ver la lista de corredores (1.Juvenil, 2.Senior, 3 Veterano)");
				categoria = Leer.datoInt();
			c.mostrarLista(c.findByCategoria(categoria));
			break;
			case 5:
				
				break;
			default:
				break;
			}
		} while (op != 0);
	}

}
