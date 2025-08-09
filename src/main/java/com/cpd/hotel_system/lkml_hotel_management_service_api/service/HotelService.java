package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.HotelPaginateResponseDto;

public interface HotelService {
    public void create(RequestHotelDto hotelDto);
    public void update(RequestHotelDto hotelDto, String hotelId);
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId);
    public HotelPaginateResponseDto findAll(int page,int size,String SearchText);

}
