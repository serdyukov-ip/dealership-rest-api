package ru.serdyukov.ip.CarDealershipRestApp.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "managers")
public class Manager {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "last_name")
    @NotEmpty(message = "Last Name should not be empty")
    @Size(min = 2, max = 30, message = "Last Name should be between 2 and 30 characters")
    String lastName;

    @Column(name = "first_name")
    @NotEmpty(message = "First Name should not be empty")
    @Size(min = 2, max = 30, message = "First Name should be between 2 and 30 characters")
    String firstName;

    @Column(name = "phone_number")
    @NotEmpty(message = "Phone should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    String phoneNumber;

}
