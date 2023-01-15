package com.ems.emsys.model;

import jakarta.persistence.*;
//Set table name: Employee
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "First_Name")
    private  String firstName;
    @Column(name = "Last_Name")
    private  String lastName;
    @Column(name = "Email")
    private  String email;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
