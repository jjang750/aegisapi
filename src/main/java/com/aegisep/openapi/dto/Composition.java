package com.aegisep.openapi.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Composition implements Serializable {
    private Integer index ;
    private String aptcode,
            orgapt,
            house_no,
            household_type,
            household_owner,
            household_name,
            household_birthday,
            household_phone;
}
