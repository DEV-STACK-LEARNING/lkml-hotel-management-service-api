package com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseRoomImageDto;
import lombok.*;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomImagePaginateResponseDto {
    private List<ResponseRoomImageDto> dataList;
    private long dataCount;
}
