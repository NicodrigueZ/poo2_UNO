package DeVeras;

public class Aplicacion {

//La complejidad de este algoritmo en el peor de los casos es de O(n^2)	
	    public static int sumaConsecutiva(int[] almacenamiento, int n, int x) {
	        int suma = 0;
	        int izq = 0;
	        int der = 0;
	        int minLongitud = n + 1;
	        int contador = 0;

	            while (suma <= x && der < n) { //O(N elevado a 2)
	                der++;
	                suma += almacenamiento[der-1];
	                if (suma >= x && der-izq < minLongitud) { //O(1)
	                    minLongitud = der-izq;//O(1)
	                    contador = minLongitud; //O(1)
	                }

	            while (suma > x && izq < n) {
	                minLongitud = Math.min(minLongitud, der - izq);
	                suma -= almacenamiento[izq];
	                izq++;
	                if (suma >= x && der-izq < minLongitud) { // Verificamos si encontramos una subsecuencia más corta
	                    minLongitud = der-izq;
	                    contador = minLongitud; // Actualizamos el contador
	                }
	            }
	        }

	        if (minLongitud <= n) {
	            return contador;
	        }

	        return 0;
	    }
	}

	

