package com.etlions.easypass.dto;


import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {

    private Long id;
    private String name;
    private String description;
    private String location;
    private LocalDate date;
    private LocalTime time;

}
