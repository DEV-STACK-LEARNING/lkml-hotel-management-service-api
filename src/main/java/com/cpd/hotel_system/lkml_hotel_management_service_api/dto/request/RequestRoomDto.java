package com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestRoomDto {
    private int bedCount;
    private boolean isAvailable;
    private String roomNumber;
    private String roomType;
    private String branchId;
}
