package com.aegisep.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Cars implements Serializable {
    private Integer index;
    private String aptcode,
            orgapt,
            house_no,
            owner_name,
            car_type,
            car_no,
            electric_car;
}
