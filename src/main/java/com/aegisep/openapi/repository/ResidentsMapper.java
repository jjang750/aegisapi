package com.aegisep.openapi.repository;

import com.aegisep.openapi.dto.CarsVo;
import com.aegisep.openapi.dto.CompositionVo;
import com.aegisep.openapi.dto.ResidentsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface ResidentsMapper {

    Collection<ResidentsVo> selectResidents (@Param("aptcode") String aptcode, @Param("house_no")  String house_no);
    Integer insertResidents(ResidentsVo vo);
    Integer insertHouseholdComposition(@Param("aptcode") String aptcode, @Param("orgapt")  String orgapt, @Param("house_no")  String house_no, @Param("compositions") List<CompositionVo> compositionVos);
    Integer insertCars(@Param("aptcode") String aptcode, @Param("orgapt")  String orgapt, @Param("house_no")  String house_no, @Param("cars") List<CarsVo> cars);
}
