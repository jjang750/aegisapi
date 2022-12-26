package com.aegisep.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Composition implements Serializable {
    private Integer index ;
    private String household_type,
            household_owner,
            household_name,
            household_birthday,
            household_phone;
}
