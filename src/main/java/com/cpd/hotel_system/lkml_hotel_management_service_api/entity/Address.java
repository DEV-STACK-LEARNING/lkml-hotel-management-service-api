package com.cpd.hotel_system.lkml_hotel_management_service_api.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @Column(name = "address_id",  length = 80)
    private String addressId;

    @Column(name = "address_line_1",  length = 250)
    private String addressLine1;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country" , nullable = true, length = 100)
    private String country;

    @Column(name="longitude", nullable = true)
    private BigDecimal longitude;

    @Column(name = "latitude", nullable = true)
    private BigDecimal latitude;

    @OneToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;


}
