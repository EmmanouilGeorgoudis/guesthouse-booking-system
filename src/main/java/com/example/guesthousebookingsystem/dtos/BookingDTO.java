package com.example.guesthousebookingsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookingDTO {
    private String name;
    private Long count;
}
