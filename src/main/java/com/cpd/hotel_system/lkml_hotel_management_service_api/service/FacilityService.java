package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestFacilityDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseFacilityDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.FacilityPaginateResponseDto;

public interface FacilityService {
    public void create(RequestFacilityDto facilityDto);
    public void update(RequestFacilityDto facilityDto, String facilityId);
    public void delete(String facilityId);
    public ResponseFacilityDto findById(String facilityId);
    public FacilityPaginateResponseDto findAll(int page, int size, String roomId);


}
