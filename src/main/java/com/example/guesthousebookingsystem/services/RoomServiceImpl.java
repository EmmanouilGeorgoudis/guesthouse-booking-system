package com.example.guesthousebookingsystem.services;

import com.example.guesthousebookingsystem.dtos.RoomDTO;
import com.example.guesthousebookingsystem.models.Room;
import com.example.guesthousebookingsystem.repositories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        return roomRepository.findAll()
                .stream()
                .map(r -> new RoomDTO(r.getName(), r.getId(), r.getRoomType(),
                        r.getExtraBeds(), r.getMaxCapacity()))
                .toList();
    }

    @Override
    public RoomDTO getById(Long id) {
        Room room = roomRepository.findById(id)
                .orElseThrow();
        return new RoomDTO(room.getName(), room.getId(), room.getRoomType(),
                room.getExtraBeds(), room.getMaxCapacity());


    }

    @Override
    public void save(RoomDTO roomDTO) {
        Room room = new Room();
        room.setId(roomDTO.getId());
        room.setName(roomDTO.getName());
        room.setRoomType(roomDTO.getRoomType());
        room.setExtraBeds(roomDTO.getExtraBeds());
        roomRepository.save(room);
    }


    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
