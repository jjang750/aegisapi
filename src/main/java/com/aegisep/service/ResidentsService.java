package com.aegisep.service;


import com.aegisep.dto.Cars;
import com.aegisep.dto.Composition;
import com.aegisep.dto.ResidentsVo;
import com.aegisep.mapper.ResidentsMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ResidentsService {
    @Autowired
    private ResidentsMapper mapper;

    public Integer insert(ResidentsVo vo){
        insertResident(vo);
        insertHouseholdComposition(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(), vo.getHousehold_composition());
        insertCars(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(),vo.getCars());

        return 1;
    }

    private void insertResident(ResidentsVo vo) {
        mapper.insertResidents(vo);
    }

    private void insertHouseholdComposition(String aptcode, String orgapt, String house_no, List<Composition> compositions) {
        mapper.insertHouseholdComposition(aptcode, orgapt, house_no, compositions);
    }

    private void insertCars(String aptcode, String orgapt, String house_no, List<Cars> cars) {
        mapper.insertCars(aptcode, orgapt, house_no, cars);
    }
}
