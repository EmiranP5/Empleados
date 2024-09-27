
package docente;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {

    public static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Connection conexionBD;
    public final String bd = "db_docente";
    public final String urlConexion = String.format("jdbc:mysql://127.0.0.1:3306/%s",bd);
    public final String usuario = "root";
    public final String contraseña = "12345678";
    public final String jdbc = "com.mysql.cj.jdbc.Driver";
    
    public void abrir_conexion(){
    try{
        Class.forName(jdbc);
        conexionBD = DriverManager.getConnection(urlConexion,usuario,contraseña);
    /*JOptionPane.showMessageDialog(null, "Conexion Exitosa...","Exito",JOptionPane.INFORMATION_MESSAGE);*/
    }catch(HeadlessException | ClassNotFoundException | SQLException ex){
        System.out.println("Error..." + ex.getMessage());
    }    
    }
    public void cerrar_conexion(){
    try{
     conexionBD.close();
    }catch(SQLException ex){
        System.out.println("Error..." + ex.getMessage());
    }
    }
    
}

    

