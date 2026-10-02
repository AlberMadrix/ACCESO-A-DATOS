package control;

import static modelo.db.EscuderiaDB.consultarEscuderias;
import static vista.Consola.mostrarEscuderias;

public class Accion {

    public static void realizarAccion(int opcion) {
        switch (opcion) {
          //  case 1 -> // TODO: INSERTAR ESCUDERIA
          //  case 2 -> // TODO: BORRAR ESCUDERIA
            case 3 -> mostrarEscuderias(consultarEscuderias());
            default -> System.out.println("Opción incorrecta");


        }
    }
}
