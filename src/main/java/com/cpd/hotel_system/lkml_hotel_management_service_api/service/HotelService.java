package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.HotelPaginateResponseDto;

import java.sql.SQLException;

public interface HotelService {
    public void create(RequestHotelDto hotelDto);
    public void update(RequestHotelDto hotelDto, String hotelId) throws SQLException;
    public void delete(String hotelId);
    public ResponseHotelDto findById(String hotelId) throws SQLException;
    public HotelPaginateResponseDto findAll(int page,int size,String SearchText);

}
