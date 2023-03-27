package com.aegisep.openapi.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResidentsMapper {
    /**
     * Aegis api naming rule
     *
     * Class 명 및 Field 명은 Java 공통 표기법인 카멜 표기법을 기본으로
     * 단, VO 클래스는 Database 와 동일하게 표기한다.
     *
     * Mapper class에는 로직을 넣지 않고,
     *      모든 로직은 Mapper XML에 넣는다.
     *
     * Package : 소문자 기본
     *   com.aegisep.<명사>.service
     *       com.aegisep.openapi.mapper
     * Mybatis Mapper
     *   class 명 : <대표 테이블>Mapper
     *     com.aegisep.openapi.service.ResidentsMapper
     *
     *   Method 명 : 접두사<대표 테이블>
     *     public Object selectResidents : select 쿼리 대표 테이블 기준
     *     public Object insertResidents : insert 쿼리 테이블명 기준
     *     public Object deleteResidents : delete 쿼리 테이블명 기준
     *     public Object updateResidents : update 쿼리 테이블명 기준
     *
     * Mapper XML
     *   Mybatis xml 파일명은 Select 쿼리의  대표 테이블 명을 기준으로 생성한다.
     *   residents.xml : Residents 테이블 관련
     */
    String getSysdate ();
}
