package com.example.guesthousebookingsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDate checkIn;
    private LocalDate checkOut;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Room room;

}