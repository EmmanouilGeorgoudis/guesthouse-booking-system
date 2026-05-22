package com.example.guesthousebookingsystem.services;

import com.example.guesthousebookingsystem.dtos.BookingDTO;
import com.example.guesthousebookingsystem.dtos.RoomDTO;
import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    List<BookingDTO> getAllBookings();
    BookingDTO getById(Long id);
    void save(BookingDTO bookingDTO);
    void delete(Long id);
    List<RoomDTO> getAvailableRooms(LocalDate checkIn, LocalDate checkOut);
}
