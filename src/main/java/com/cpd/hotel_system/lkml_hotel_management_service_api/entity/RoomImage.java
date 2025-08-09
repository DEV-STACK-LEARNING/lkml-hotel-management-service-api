package com.cpd.hotel_system.lkml_hotel_management_service_api.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "images")
public class RoomImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long imageId;

    @Embedded
    private FileFormatter fileFormatter;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;
}
