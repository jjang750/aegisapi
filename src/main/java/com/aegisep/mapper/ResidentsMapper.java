package com.aegisep.mapper;

import com.aegisep.dto.Cars;
import com.aegisep.dto.Composition;
import com.aegisep.dto.ResidentsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ResidentsMapper {
    Optional<Integer> insertResidents(ResidentsVo vo);
    Optional<Integer> insertHouseholdComposition(List<Composition> compositions);
    Optional<Integer> insertCars(List<Cars> cars);
}
