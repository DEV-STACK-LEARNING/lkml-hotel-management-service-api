package com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseFacilityDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FacilityPaginateResponseDto {
    private List<ResponseFacilityDto> dataList;
    private long dataCount;
}
