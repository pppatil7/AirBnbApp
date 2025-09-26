package com.practice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String city;

    @ElementCollection
    @CollectionTable(name = "hotel_photos",
            joinColumns = @JoinColumn(name = "hotel_id"))
    private Set<String> photos = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "hotel_amenities",
            joinColumns = @JoinColumn(name = "hotel_id"))
    private Set<String> amenities = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Embedded
    private HotelContactInfo contactInfo;

    @Column(nullable = false)
    private boolean active;

    @ManyToOne
    private User owner;

    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

}
