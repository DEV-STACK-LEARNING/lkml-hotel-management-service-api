package com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseAddressDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressPaginateResponseDto {
    private List<ResponseAddressDto> dataList;
    private long dataCount;
}
