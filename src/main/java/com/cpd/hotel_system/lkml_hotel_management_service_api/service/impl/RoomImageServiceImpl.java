package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestRoomImageDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseRoomImageDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.RoomImagePaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.RoomImageService;
import org.springframework.stereotype.Service;

@Service
public class RoomImageServiceImpl implements RoomImageService {
    @Override
    public void create(RequestRoomImageDto roomImageDto) {

    }

    @Override
    public void update(RequestRoomImageDto roomImageDto, String roomImageId) {

    }

    @Override
    public void delete(String roomImageId) {

    }

    @Override
    public ResponseRoomImageDto findById(String roomImageId) {
        return null;
    }

    @Override
    public RoomImagePaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
