package com.example.guesthousebookingsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long id;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Long customerId;
    private Long roomId;
}
