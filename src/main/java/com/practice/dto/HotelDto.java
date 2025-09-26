package com.practice.dto;

import com.practice.entity.HotelContactInfo;
import lombok.Data;

import java.util.Set;

@Data
public class HotelDto {

    private Long id;
    private String name;
    private String city;
    private Set<String> photos;
    private Set<String> amenities;
    private HotelContactInfo contactInfo;
    private boolean active;

}
