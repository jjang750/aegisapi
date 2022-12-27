package com.aegisep.mapper;

import com.aegisep.dto.Cars;
import com.aegisep.dto.Composition;
import com.aegisep.dto.ResidentsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ResidentsMapper {
    Integer insertResidents(ResidentsVo vo);
    Integer insertHouseholdComposition(List<Composition> compositions);
    Integer insertCars(List<Cars> cars);
}
