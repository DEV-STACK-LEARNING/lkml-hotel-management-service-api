package com.cpd.hotel_system.lkml_hotel_management_service_api.advicer;

import com.cpd.hotel_system.lkml_hotel_management_service_api.exception.EntryNotFoundException;
import com.cpd.hotel_system.lkml_hotel_management_service_api.util.StanderdResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(EntryNotFoundException.class)
    public ResponseEntity<StanderdResponseDto> handleEntryNotFoundException(EntryNotFoundException ex) {
     return new ResponseEntity<StanderdResponseDto>(
             new StanderdResponseDto(404,ex.getMessage(),ex),
             HttpStatus.NOT_FOUND
     );
    }
}
