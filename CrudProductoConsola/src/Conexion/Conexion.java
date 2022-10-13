package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    Connection con;
    String url = "jdbc:mysql://localhost:3306/productosjdbc";
    String user = "sebas11";
    String pass = "12345";

    public Connection Conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;

    }
}
