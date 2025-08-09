package com.cpd.hotel_system.lkml_hotel_management_service_api.dto.response;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseAddressDto {
    private String addressLine;
    private String city;
    private String Country;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String BranchId;
}
