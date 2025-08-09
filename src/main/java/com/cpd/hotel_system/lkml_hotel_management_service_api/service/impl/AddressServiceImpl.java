package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestAddressDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseAddressDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public void create(RequestAddressDto addressDto) {

    }

    @Override
    public void update(RequestAddressDto addressDto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseAddressDto findById(String addressId) {
        return null;
    }

    @Override
    public ResponseAddressDto findByBranchId(String branchId) {
        return null;
    }
}
