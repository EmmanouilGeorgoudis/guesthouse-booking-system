package com.example.guesthousebookingsystem.service;

import com.example.guesthousebookingsystem.dto.RoomDTO;
import java.util.List;

public interface RoomService {
    List<RoomDTO> getAllRooms();
    RoomDTO getByRoom(Long id);
    void save(RoomDTO roomsDTO);
    void delete(Long id);
}
