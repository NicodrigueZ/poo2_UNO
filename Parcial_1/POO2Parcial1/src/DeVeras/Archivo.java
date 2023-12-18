package DeVeras;

import java.io.*;


public class Archivo {
	
	//La complejidad de esta clase es de O(n)

    private int[] almacenamiento = null;
    private int cantApps;
    private int pesoApp;

    public void leerArchivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\fabia\\eclipse-workspace\\POO2Parcial1\\src\\almacenamiento.in"));
        String linea = br.readLine();
        String[] datos = linea.split(" ");
        if (Integer.parseInt(datos[0]) > 0 && Integer.parseInt(datos[0]) <= 50000 || datos.length<=50000) {
            cantApps = Integer.parseInt(datos[0]);
        } else
            throw new Error("Cantidad de apps ingresada erronea (Min = 1 | Max = 50000)");
        if (Integer.parseInt(datos[1]) > 0 && Integer.parseInt(datos[1]) <= 1000) {
            pesoApp = Integer.parseInt(datos[1]);
        } else
            throw new Error("Tamaño de Megas Erroneo (Min = 1 | Max = 1000");

        this.almacenamiento = new int[cantApps];
        linea = br.readLine();
        datos = linea.split(" ");

        for (int i = 0; i < cantApps; i++) {
            if (Integer.parseInt(datos[i]) < 1) {
                throw new Error("No se admiten numeros negativos");
            }
            almacenamiento[i] = Integer.parseInt(datos[i]);
        }
        br.close();

    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = new FileWriter("almacenamiento.out");
        fw.write(Integer.toString(Aplicacion.sumaConsecutiva(almacenamiento, cantApps, pesoApp)));
        fw.close();
    }

}









