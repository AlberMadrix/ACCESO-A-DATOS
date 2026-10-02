package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Escuderia {

    private int idEscuderia;
    private String nameEscuderia;


    public Escuderia() {

    }

    public Escuderia(int idEscuderia, String nameEscuderia) {
        this.idEscuderia = idEscuderia;
        this.nameEscuderia = nameEscuderia;
    }

    public int getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(int idEscuderia) {
        this.idEscuderia = idEscuderia;
    }

    public String getNameEscuderia() {
        return nameEscuderia;
    }

    public void setNameEscuderia(String nameEscuderia) {
        this.nameEscuderia = nameEscuderia;
    }




    @Override
    public String toString() {
        return "Escuderia [" +
                "idEscuderia: " + idEscuderia +
                ", nameEscuderia: '" + nameEscuderia
                + ']';
    }
}
