package com.practice.service;

import com.practice.dto.HotelDto;
import com.practice.dto.HotelSearchRequest;
import com.practice.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);


    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
