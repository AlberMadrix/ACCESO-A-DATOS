package modelo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static String url = "jdbc:mysql://localhost:3306/formula1";
    private static String user = "root";
    private static String password = "";
    private static String driver = "com.mysql.cj.jdbc.Driver";

    private static Connection jdbcConexion = null;

    private Conexion() {
        try {
            // la conexión es nula o cerrada? la creo
            if ((jdbcConexion == null) || jdbcConexion.isClosed()) {
                Class.forName(driver);
                jdbcConexion = DriverManager.getConnection(url, user, password);
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException();
        }
    }

    /**
     * Patron singleton
     * Solo garantizamos que exista un unico objeto de la conexion, evitando que podamos crear mas de una conexion a la db
     *
     * @return retorna el estado de la conextion, si esta es nula o estaba cerrada, crea una nueva conexión
     */
    public static Connection conectar() {
        // creamos el objeto conexion cuando queremos conectar para que compruebe si la conexion existia o no
        new Conexion();
        return jdbcConexion;
    }

    public static void desconectar() {

        try {
            if (!jdbcConexion.isClosed() || jdbcConexion != null) {
                jdbcConexion = null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
