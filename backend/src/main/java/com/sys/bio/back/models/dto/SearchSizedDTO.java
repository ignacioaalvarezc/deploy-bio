package com.sys.bio.back.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
public class SearchSizedDTO {

    private String responsible;
    private String strawType;
    private Double startWeight;
    private Double endWeight;
    private Integer startAmount;
    private Integer endAmount;
    private LocalDate startDate;
    private LocalDate endDate;

}
