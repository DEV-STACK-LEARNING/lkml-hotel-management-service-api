package com.cpd.hotel_system.lkml_hotel_management_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;

@Embeddable
public class FileFormatter {
    @Lob
    @Column(name = "file_name", nullable = false)
    private byte[] fileName;

    @Column(name = "resource_url", nullable = false)
    private byte[] resourceUrl;

    @Column(name = "directory", nullable = false)
    private byte[] directory;

    @Column(name = "hash", nullable = false)
    private byte[] hash;

}
