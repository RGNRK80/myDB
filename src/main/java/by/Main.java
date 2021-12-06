package by;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
/*
    public static void main(String[] args) throws SQLException {

        // подключение
        String url ="jdbc:mysql://localhost:3306/firstblood";
        String user="root";
        String pass="dd286082";
        Connection connection= DriverManager.getConnection(url,user,pass);


        // примитивный запрос SElect
        Statement statement=connection.createStatement();
        String sql= "SELECT * FROM user";
        String sql1= "SELECT * FROM user WHERE id=1"; //by id
        String email="'pavivan@gmail.com'";
        String sql2= "SELECT * FROM user WHERE id=1"; //by id
        ResultSet resultSet = statement.executeQuery(sql1);


        // вывод
        List<User> users = new ArrayList<>();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
            User user1;
            user1 = new User();

            user1.setId(resultSet.getLong("id"));
            user1.setName(resultSet.getString("name"));
            user1.setSurname(resultSet.getString("surname"));
            user1.setAge(resultSet.getInt("age"));
            user1.setPhone(resultSet.getString("phone_number"));
            user1.setEmail(resultSet.getString("email"));
            users.add(user1);

}
          // стрим печать
           users.stream().forEach(System.out::println);


String sql3= "SELECT * FROM user WHERE email=?"; //by id
PreparedStatement preparedStatement=connection.prepareStatement(sql3);
preparedStatement.setString(1,email);



        // нормальный запрос
        String insert = "INSERT INTO user VALUES(0,?,?,?)";
        PreparedStatement preparedStatement1=connection.prepareStatement(insert);
        preparedStatement1.setString(1,email);
        preparedStatement1.setString(1,"Hog");

// и т д
        preparedStatement1.executeUpdate();
        preparedStatement1.

}  */
}

