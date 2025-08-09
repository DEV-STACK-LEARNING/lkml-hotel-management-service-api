package com.cpd.hotel_system.lkml_hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @Column(name = "room_id", nullable = false, length = 80)
    private String roomId;

    @Column(name = "room_type", nullable = false, length = 50)
    private String roomType;

    @Column(name = "room_number", nullable = false, length = 20)
    private String roomNumber;

    @Column(name="bed_count")
    private int bedCount;

    @Column(name="price")
    private BigDecimal price;

    @Column(name = "is_available")
    private boolean isAvailable;

    @ManyToOne()
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "room")
    private List<Facility> facilities;

    @OneToMany(mappedBy = "room")
    private List<RoomImage> roomImages;

}
