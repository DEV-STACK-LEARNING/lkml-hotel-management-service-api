package com.cpd.hotel_system.lkml_hotel_management_service_api.service;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.BranchPaginateResponseDto;

public interface BranchService {
    public void create(RequestBranchDto branchDto);
    public void update(RequestBranchDto branchDto, String branchId);
    public void delete(String branchId);
    public ResponseBranchDto findById(String branchId);
    public BranchPaginateResponseDto findAll(int page, int size, String SearchText);
    public BranchPaginateResponseDto findAllByHotelId(int page, int size, String hotelId, String searchText);

}
