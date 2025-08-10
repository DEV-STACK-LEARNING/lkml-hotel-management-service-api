package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseRoomDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.lkml_hotel_management_service_api.entity.Hotel;
import com.cpd.hotel_system.lkml_hotel_management_service_api.entity.Room;
import com.cpd.hotel_system.lkml_hotel_management_service_api.repo.HotelRepo;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.lkml_hotel_management_service_api.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepo hotelRepo;
    private final ByteCodeHandler byteCodeHandler;

    @Override
    public void create(RequestHotelDto hotelDto) {

        try {
            hotelRepo.save(toHotel(hotelDto));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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

    private Hotel toHotel(RequestHotelDto dto) throws SQLException {
        return  dto == null ? null :
        Hotel.builder()
                .hotelName(dto.getHotelName())
                .hotelId(UUID.randomUUID().toString())
                .starRating(dto.getStarRating())
                .description(byteCodeHandler.stringToBlob(dto.getDescription()))
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .activeStatus(true)
                .startingFrom(dto.getStartingFrom())
                .build();
    }

    private ResponseHotelDto toResponseHotelDto(Hotel hotel) throws SQLException {
        return  hotel == null ? null :
                ResponseHotelDto.builder()
                        .hotelId(hotel.getHotelId())
                        .hotelName(hotel.getHotelName())
                        .starRating(hotel.getStarRating())
                        .description(byteCodeHandler.blobToString(hotel.getDescription()))
                        .createdAt(hotel.getCreatedAt())
                        .updatedAt(hotel.getUpdatedAt())
                        .activeStatus(hotel.isActiveStatus())
                        .startingFrom(hotel.getStartingFrom())
                        .branches(
                                hotel.getBranches().stream().map( e->{
                                    try {
                                       return toResponseBranchDto(e);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }

                                }).toList()
                        )
                        .build();
    }

    private ResponseBranchDto toResponseBranchDto(Branch branch) throws SQLException {
        return  branch==null?
                null :
                ResponseBranchDto.builder()
                        .branchId(branch.getBranchId())
                        .branchName(branch.getBranchName())
                        .branchType(branch.getBranchType())
                        .roomCount(branch.getRoomCount())
                        .build();
    }

}


