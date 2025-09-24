package com.practice.service;

import com.practice.dto.RoomDto;
import com.practice.entity.Hotel;
import com.practice.entity.Room;
import com.practice.exception.ResourceNotFoundException;
import com.practice.repository.HotelRepository;
import com.practice.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;

    @Override
    public RoomDto createNewRoom(Long hotelId, RoomDto roomDto) {
        log.info("Creating a new room in hotel with ID: {}", hotelId);
        Hotel hotel = hotelRepository.findById(hotelId)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: " + hotelId));
        Room room = modelMapper.map(roomDto, Room.class);
        room.setHotel(hotel);
        room = roomRepository.save(room);

        //TODO: create room as soon as room is created and if hotel is active

        return modelMapper.map(room, RoomDto.class);
    }

    @Override
    public List<RoomDto> getAllRoomsInHotel(Long hotelId) {
        return List.of();
    }

    @Override
    public RoomDto getRoomById(Long roomId) {
        return null;
    }

    @Override
    public void deleteRoomById(Long roomId) {

    }
}
