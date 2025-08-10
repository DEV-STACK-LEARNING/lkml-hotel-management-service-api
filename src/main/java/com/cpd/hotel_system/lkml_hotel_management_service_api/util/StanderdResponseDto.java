package com.cpd.hotel_system.lkml_hotel_management_service_api.util;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StanderdResponseDto {
    private int code;
    private String message;
    private Object data;
}
