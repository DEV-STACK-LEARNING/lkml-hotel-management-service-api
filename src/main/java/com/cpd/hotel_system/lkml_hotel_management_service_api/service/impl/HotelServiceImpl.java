package com.cpd.hotel_system.lkml_hotel_management_service_api.service.impl;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseBranchDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.ResponseHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response.peginate.HotelPaginateResponseDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.entity.Branch;
import com.cpd.hotel_system.lkml_hotel_management_service_api.entity.Hotel;
import com.cpd.hotel_system.lkml_hotel_management_service_api.exception.EntryNotFoundException;
import com.cpd.hotel_system.lkml_hotel_management_service_api.repo.HotelRepo;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.lkml_hotel_management_service_api.util.ByteCodeHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

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
    public void update(RequestHotelDto hotelDto, String hotelId) throws SQLException {

         Hotel selectedHotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found with id: " + hotelId));

            selectedHotel.setHotelName(hotelDto.getHotelName());
            selectedHotel.setStarRating(hotelDto.getStarRating());
            selectedHotel.setDescription(byteCodeHandler.stringToBlob(hotelDto.getDescription()));
            selectedHotel.setUpdatedAt(LocalDateTime.now());
            selectedHotel.setStartingFrom(hotelDto.getStartingFrom());
            hotelRepo.save(selectedHotel);


    }

    @Override
    public void delete(String hotelId) {
        hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found with id: " + hotelId));
        hotelRepo.deleteById(hotelId);

    }

    @Override
    public ResponseHotelDto findById(String hotelId)throws SQLException {
        Hotel hotel = hotelRepo.findById(hotelId).orElseThrow(()->new EntryNotFoundException("Hotel not found with id: " + hotelId));
        return toResponseHotelDto(hotel);
    }

    @Override
    public HotelPaginateResponseDto findAll(int page, int size, String searchText) {
       return HotelPaginateResponseDto.builder()
                .dataCount(hotelRepo.countAllHotels(searchText))
                .dataList(
                        hotelRepo.searchAllHotels(searchText, PageRequest.of(page, size))
                                .stream().map(e-> {
                                    try {
                                        return toResponseHotelDto(e);
                                    } catch (SQLException ex) {
                                        throw new RuntimeException(ex);
                                    }
                                }).toList()
                ).build();
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


