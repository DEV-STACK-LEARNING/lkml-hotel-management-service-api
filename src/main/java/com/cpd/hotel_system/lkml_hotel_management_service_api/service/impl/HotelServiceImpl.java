package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.HotelService;
import org.springframework.stereotype.Service;

@Service
public class HotelServiceImpl implements HotelService {
    @Override
    public void create(RequestHotelDto hotelDto) {

    }

    @Override
    public void update(RequestHotelDto hotelDto, String hotelId) {

    }

    @Override
    public void delete(String hotelId) {

    }

    @Override
    public ResponseHotelDto findById(String hotelId) {
        return null;
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String SearchText) {
        return null;
    }
}
