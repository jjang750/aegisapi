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
    /**
     * Aegis api naming rule
     *
     * Class 명 및 Field 명은 Java 공통 표기법인 카멜 표기법을 기본으로
     * 단, VO 클래스는 Database 와 동일하게 표기한다.
     *
     * Package : 소문자 기본
     *   com.aegisep.<명사>
     *       com.aegisep.openapi.dto
     *
     * Value Object
     *   class 명 : <대표 테이블>Vo
     *     com.aegisep.openapi.dto.ResidentsVo
     *
     *   필드명 : private String user_name;
     *     _ (언더바)를 사용하는 스네이크 표기볍을 기본으로 DB 테이블 컬럼명과 동일하게 선언한다.
     *
     */
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
}



