package by.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        // подключение
        String url ="jdbc:mysql://localhost:3306/mydbclinic";
        String user="root";
        String pass="dd286082";
        Connection connection= DriverManager.getConnection(url,user,pass);

        String insert = "INSERT INTO doc VALUES(0,?,?,?,?)";
        PreparedStatement preparedStatement1=connection.prepareStatement(insert);
    }
}
