package com.aegisep.service;


import com.aegisep.dto.Cars;
import com.aegisep.dto.Composition;
import com.aegisep.dto.ResidentsVo;
import com.aegisep.mapper.ResidentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentsService {
    @Autowired
    private ResidentsMapper mapper;

    public Integer insert(ResidentsVo vo){

        insertResident(vo);
        insertHouseholdComposition(vo.getHousehold_composition());
        insertCars(vo.getCars());

        return 1;
    }

    private Integer insertResident(ResidentsVo vo) {
        return mapper.insertResidents(vo).orElseThrow();
    }

    private Integer insertHouseholdComposition(List<Composition> compositions) {
        return mapper.insertHouseholdComposition(compositions).orElseThrow();
    }

    private Integer insertCars(List<Cars> cars) {
        return mapper.insertCars(cars).orElseThrow();
    }
}
