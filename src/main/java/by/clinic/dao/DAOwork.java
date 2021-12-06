package by.clinic.dao;

import by.clinic.entity.Customer;
import by.clinic.entity.Doctor;
import by.clinic.entity.Pet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOwork implements DAOworkServ{


    @Override
    public boolean connection(String url, String pass, String log) throws SQLException {
        String rezult;
        Connection connection= DriverManager.getConnection(url,log,pass);
        return connection.isClosed();
    }

    @Override
    public Doctor addNewDoc(Doctor doc) {
        return null;
    }

    @Override
    public Doctor setDoc(Doctor doc) {
        return null;
    }

    @Override
    public Doctor delDoc(Doctor doc) {
        return null;
    }

    @Override
    public Customer addNewCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer setCustomer(Customer customer) {
        return null;
    }

    @Override
    public Pet addNewPet(Pet pet) {
        return null;
    }

    @Override
    public Pet setPet(Pet pet) {
        return null;
    }
}
