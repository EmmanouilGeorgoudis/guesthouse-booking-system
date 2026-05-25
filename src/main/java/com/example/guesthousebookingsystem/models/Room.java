package com.example.guesthousebookingsystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank
    private String name;


    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    private int extraBeds; // 0, 1, 2

    public Room(String a1, RoomType roomType) {
    }

    public int getMaxCapacity() {
        int base = (roomType == RoomType.SINGLE) ? 1 : 2;
        return base + extraBeds;
    }


    public Room(String name) {
        this.name = name;
    }
}
