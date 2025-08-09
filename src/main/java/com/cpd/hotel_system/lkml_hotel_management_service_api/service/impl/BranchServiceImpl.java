package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.BranchPaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.BranchService;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    @Override
    public void create(RequestBranchDto branchDto) {

    }

    @Override
    public void update(RequestBranchDto branchDto, String branchId) {

    }

    @Override
    public void delete(String branchId) {

    }

    @Override
    public ResponseBranchDto findById(String branchId) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAll(int page, int size, String SearchText) {
        return null;
    }

    @Override
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText) {
        return null;
    }
}
