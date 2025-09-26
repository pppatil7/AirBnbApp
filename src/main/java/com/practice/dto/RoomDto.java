package com.practice.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class RoomDto {

    private Long id;
    private String type;
    private BigDecimal basePrice;
    private Set<String> photos;
    private Set<String> amenities;
    private Integer totalCount;
    private Integer capacity;

}
