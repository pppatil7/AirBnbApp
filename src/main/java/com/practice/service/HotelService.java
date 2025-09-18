package com.practice.service;

import com.practice.dto.HotelDto;

public interface HotelService {


    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

}
