package com.example.guesthousebookingsystem.service;

import com.example.guesthousebookingsystem.dto.BookingDTO;
import com.example.guesthousebookingsystem.dto.RoomDTO;
import java.time.LocalDate;
import java.util.List;

public interface BookingService {
    List<BookingDTO> getAllBookings();
    BookingDTO getById(Long id);
    void save(BookingDTO bookingDTO);
    void delete(Long id);
    List<RoomDTO> getAvailableRooms(LocalDate checkIn, LocalDate checkOut);
}
