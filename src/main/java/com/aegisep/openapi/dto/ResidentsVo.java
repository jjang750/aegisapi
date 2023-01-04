package com.aegisep.openapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
public class ResidentsVo implements Serializable {
    private String aptcode,
                    orgapt,
                    house_no,

                    head_of_household,
                    same_address,
                    have_car,
                    house_owner,

                    apt_name,
                    apt_dong,
                    apt_ho,
                    moving_in_date,
                    residence_from,
                    residence_to,
                    owner_name,
                    owner_address,
                    owner_phone,
                    api,
                    version,
                    description;

    private List<CompositionVo> household_compositionVo;
    private List<CarsVo> cars;
}



