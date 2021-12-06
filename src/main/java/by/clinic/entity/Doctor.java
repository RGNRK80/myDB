package by.clinic.entity;

import lombok.Data;


public class Doctor extends User{
    private String position;

    public Doctor() {
        super();
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
