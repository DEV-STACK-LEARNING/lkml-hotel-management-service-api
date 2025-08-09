package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.RoomImagePaginateResponseDto;

public interface RoomImageService {
    public void create(RequestRoomImageDto roomImageDto);
    public void update(RequestRoomImageDto roomImageDto, String roomImageId);
    public void delete(String roomImageId);
    public ResponseRoomImageDto findById(String roomImageId);
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId);

}
