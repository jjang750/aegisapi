package com.aegisep.openapi.service;

public interface ResidentsService {
    /**
     * Aegis api naming rule
     *
     * Class 명 및 Field 명은 Java 공통 표기법인 카멜 표기법을 기본으로
     * 단, VO 클래스는 Database 와 동일하게 표기한다.
     *
     * Package : 소문자 기본
     *   com.aegisep.<명사>.service
     *       com.aegisep.openapi.service
     *
     * Service
     *   class 명 : <대표 테이블>Service
     *     com.aegisep.openapi.service.ResidentsService
     *
     *   Method 명 : 접두사<대표 테이블>
     *     public Object selectResidents : select 단일 쿼리 메인 테이블명 기준
     *     public Object selectAllResidents : select 목록 쿼리 메인 테이블명 기준
     *     public Object deleteResidents : delete 쿼리 테이블명 기준
     *     public Object updateResidents : update 쿼리 테이블명 기준
     */
    String getSysdate();
}
