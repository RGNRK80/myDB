package by.clinic.entity;

import lombok.Data;

@Data
public class Customer extends User{
    private double checkToPay;
    private double totalPayment;
    private int discount;

}
