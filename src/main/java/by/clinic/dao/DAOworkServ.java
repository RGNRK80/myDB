package by.clinic.dao;

import by.clinic.entity.Customer;
import by.clinic.entity.Doctor;
import by.clinic.entity.Pet;

import java.sql.SQLException;


public interface DAOworkServ  {
    boolean connection(String url, String pass, String log) throws SQLException;
    Doctor addNewDoc(Doctor doc);
    Doctor setDoc(Doctor doc);
    Doctor delDoc(Doctor doc);
    Customer addNewCustomer(Customer customer);
    Customer setCustomer(Customer customer);
    Pet addNewPet(Pet pet);
    Pet setPet(Pet pet);


}
