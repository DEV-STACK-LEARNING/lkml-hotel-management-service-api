package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseAddressDto;

public interface AddressService {
    public void create(RequestAddressDto addressDto);
    public void update(RequestAddressDto addressDto, String branchId);
    public void delete(String branchId);
    public ResponseAddressDto findById(String addressId);
    public ResponseAddressDto findByBranchId(String branchId);


}
