package com.cpd.hotel_system.lkml_hotel_management_service_api.api;

import com.cpd.hotel_system.lkml_hotel_management_service_api.dto.request.RequestHotelDto;
import com.cpd.hotel_system.lkml_hotel_management_service_api.service.HotelService;
import com.cpd.hotel_system.lkml_hotel_management_service_api.util.StanderdResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotel-management/api/v1/hotels")
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("/user/create")
    public ResponseEntity<StanderdResponseDto> create(@RequestBody RequestHotelDto dto) {
        hotelService.create(dto);
        return new ResponseEntity<>(
                new StanderdResponseDto(201, "Hotel created successfully", null),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/admin/update/{id}")
    public ResponseEntity<StanderdResponseDto> update(@PathVariable("id") String hotelId, @RequestBody RequestHotelDto dto) throws SQLException {
        hotelService.update(dto, hotelId);
        return new ResponseEntity<>(
                new StanderdResponseDto(201, "Hotel updated", null),
                HttpStatus.CREATED
        );
    }

    @DeleteMapping("/host/delete/{id}")
    public ResponseEntity<StanderdResponseDto> delete(@PathVariable("id") String hotelId) throws SQLException {
        hotelService.delete(hotelId);
        return new ResponseEntity<>(
                new StanderdResponseDto(204, "Hotel deleted", null),
                HttpStatus.NO_CONTENT
        );
    }

    @GetMapping("/visitor/find-by-id/{id}")
    public ResponseEntity<StanderdResponseDto> findById(@PathVariable("id") String hotelId) throws SQLException {
        hotelService.findById(hotelId);
        return new ResponseEntity<>(
                new StanderdResponseDto(200, "Hotel Found", hotelService.findById(hotelId)),
                HttpStatus.OK
        );
    }

    @GetMapping("/visitor/find-all")
    public ResponseEntity<StanderdResponseDto> findAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ) throws SQLException {
        return new ResponseEntity<>(
                new StanderdResponseDto(200, "Hotel List", hotelService.findAll(page, size, searchText)),
                HttpStatus.OK
        );
    }

}