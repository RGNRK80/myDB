package by.clinic.controller;

import by.clinic.dao.DAOwork;
import by.clinic.entity.Doctor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // соединение с БД
        // подключение

        String url ="jdbc:mysql://localhost:3306/mydbclinic";
        String user="root";
        String pass="dd286082";


        DAOwork dao = new DAOwork();
        System.out.println(dao.connection(url,user,pass));









    }//psvm
}//main
