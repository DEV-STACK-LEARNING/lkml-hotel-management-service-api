package com.cpd.hotel_system.lkml_hotel_management_service_api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "facilities")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long facilityId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room room;

}
