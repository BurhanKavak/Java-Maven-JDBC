package org.example;


import java.sql.*;

public class App
{
    public static void main( String[] args )
    {

        DbConnection dbConnection = new DbConnection();
        ResultSet resultSet;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = dbConnection.getConnection();
            Statement statement = connection.createStatement();

           // String query = "INSERT INTO student(id,firstName) VALUES (104,'Yenes')";
           // String query = "UPDATE student SET firstName = 'Yenes2' where id = 104";
           // String query = "DELETE FROM student where id = 104";

            resultSet = statement.executeQuery("SELECT * FROM student");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstName"));
            }


           // statement.executeUpdate(query);



        } catch (SQLException e) {
            dbConnection.showErrorMessage(e);
        } catch (ClassNotFoundException e) {
            dbConnection.showErrorMessageClass(e);
        }


    }
}
