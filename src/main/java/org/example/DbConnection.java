package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {

   private String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
   private String user = "root";
   private String password = "kajmer5858";
   private ResultSet resultSet;



    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Hata mesaji : " + exception.getMessage());
    }

    public void showErrorMessageClass(ClassNotFoundException exception) {
        System.out.println("Hata mesaji : " + exception.getMessage());
    }
}
