import static control.Accion.realizarAccion;
import static vista.Consola.leerOpcion;
import static vista.Consola.mostrarMenu;

public class Main {

    static void main() {

        // mostrar menu inicial
        mostrarMenu();
        int opcion;
        while ((opcion = leerOpcion()) != 0) {
            realizarAccion(opcion);
            System.out.println("");
            mostrarMenu();

        }
    }
}






