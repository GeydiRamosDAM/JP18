/* en este proyecto mostraremos los datos que tenemos a una base de datos desde Heidi.sql
 */
package javaapplication18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaApplication18 {

    
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver"); // uso del driver mysql
            //Ahora establezco la conexion, utilizando los datos  del servidor como BD, usuario y contraseña
            Connection conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/curso", "user_curso", "Curso1234*");
            //Preparo una peticion a la base de datos
            Statement peticion = conexion.createStatement();
            //Ejecuto la peticion
            ResultSet resultado = peticion.executeQuery("SELECT * FROM Curso_Insercion");
            while(resultado.next())
            {
            System.out.println(resultado.getString("Nombre"));
            }
        }catch(Exception e){ //Captura de error
                e.printStackTrace(); //imprime en mensaje de error en caso de existir 
        
        }
    }
    
}
