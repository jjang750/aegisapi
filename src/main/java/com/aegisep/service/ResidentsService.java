package com.aegisep.service;


import com.aegisep.dto.ResidentsVo;
import com.aegisep.mapper.ResidentsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ResidentsService {
    @Autowired
    private ResidentsMapper mapper;

    public Integer insert(ResidentsVo vo){
        mapper.insertResidents(vo);
        mapper.insertHouseholdComposition(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(), vo.getHousehold_composition());
        mapper.insertCars(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(),vo.getCars());

        return 1;
    }
}
