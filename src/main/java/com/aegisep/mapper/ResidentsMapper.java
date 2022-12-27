package com.aegisep.mapper;

import com.aegisep.dto.Cars;
import com.aegisep.dto.Composition;
import com.aegisep.dto.ResidentsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ResidentsMapper {
    Integer insertResidents(ResidentsVo vo);
    Integer insertHouseholdComposition(@Param("aptcode") String aptcode, @Param("orgapt")  String orgapt, @Param("house_no")  String house_no, @Param("compositions") List<Composition> compositions);
    Integer insertCars(@Param("aptcode") String aptcode, @Param("orgapt")  String orgapt, @Param("house_no")  String house_no, @Param("cars") List<Cars> cars);
}
