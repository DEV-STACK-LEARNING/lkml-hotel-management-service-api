package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.FacilityPaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.FacilityService;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Override
    public void create(RequestFacilityDto facilityDto) {

    }

    @Override
    public void update(RequestFacilityDto facilityDto, String facilityId) {

    }

    @Override
    public void delete(String facilityId) {

    }

    @Override
    public ResponseFacilityDto findById(String facilityId) {
        return null;
    }

    @Override
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId) {
        return null;
    }
}
