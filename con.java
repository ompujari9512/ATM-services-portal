package ATM_services_portal;

import java.sql.*;

public class con {
    Connection connection;
    Statement statement;



    public con() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Password");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
