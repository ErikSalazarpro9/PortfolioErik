
package Controlador;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
    private String USERNAME="root";
    private String PASSWORD="fenix123";
    private String HOST= "localhost";
    private String PORT="3306";
    private String DATABASE="loginjsp";
    private String CLASSNAME="com.mysql.jdbc.Driver";
    private String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
    private Connection con;
    
    public ConexionBD(){
        try {
            Class.forName(CLASSNAME);
            con =DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR"+e);  
        }catch (SQLException e){
            System.out.println("Error"+ e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
    
    public static void main(String[] args){
      ConexionBD con = new ConexionBD();  
    }
}
