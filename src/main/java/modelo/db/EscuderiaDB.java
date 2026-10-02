package modelo.db;

import modelo.Escuderia;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static modelo.db.Conexion.*;

public class EscuderiaDB {

    public static List<Escuderia> consultarEscuderias() {
        List<Escuderia> escuderias = new ArrayList<>();
        ResultSet rs;
        try {
            Connection conexion = conectar();
            Statement st = conexion.createStatement();
            String sql = "SELECT * FROM escuderia";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Escuderia escuderia = new Escuderia();
                escuderia.setIdEscuderia(rs.getInt("id_escuderia")); // o columnIndex: 1
                escuderia.setNameEscuderia(rs.getString("name_escuderia")); // columnIndex: 2
                escuderias.add(escuderia);
            }
            desconectar();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return escuderias;
    }
}
