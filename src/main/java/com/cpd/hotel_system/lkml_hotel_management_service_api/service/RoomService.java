package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestRoomDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.RoomPaginateResponseDto;

public interface RoomService {
    public void create(RequestRoomDto roomDto);
    public void update(RequestRoomDto roomDto, String roomId);
    public void delete(String roomId);
    public ResponseRoomDto findById(String roomId);
    public RoomPaginateResponseDto findAll(int page, int size);


}
