package vista;

import modelo.Escuderia;

import java.util.List;
import java.util.Scanner;

public class Consola {

    static Scanner sc = new Scanner(System.in);

    public static void mostrarMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ==== MI APP DE FÓRMULA 1 ==== \n" );
        sb.append("1. Insertar escuderia\n");
        sb.append("2. Borrar escuderia\n");
        sb.append("3. Seleccionar escuderia\n");
        sb.append("0. Salir\n");
        sb.append(" =============================\n");
        sb.append("Opción: ");
        System.out.println(sb.toString());
    }

    public static int leerOpcion() {
        return sc.nextInt();
    }

    public static void mostrarEscuderias(List<Escuderia> escuderias) {
        escuderias.forEach(System.out::println);
    }
}
