package com.aegisep.openapi.service;


import com.aegisep.openapi.dto.ResidentsVo;
import com.aegisep.openapi.repository.ResidentsMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.Collection;

@Slf4j
@Service
@AllArgsConstructor
public class ResidentsService {
    @Autowired
    private ResidentsMapper mapper;

    private final PlatformTransactionManager transactionManager;


    public Collection<ResidentsVo> selectResidents(String aptcode, String house_no) {
        return mapper.selectResidents(aptcode, house_no);
    }

    public Integer insert(ResidentsVo vo){

        TransactionStatus txStatus =
                transactionManager.getTransaction(new DefaultTransactionDefinition());
        try {
            mapper.insertResidents(vo);
            mapper.insertHouseholdComposition(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(), vo.getHousehold_compositionVo());
            mapper.insertCars(vo.getAptcode(), vo.getOrgapt(), vo.getHouse_no(),vo.getCars());

        } catch (Exception e) {
            transactionManager.rollback(txStatus);
            throw e;
        }
        transactionManager.commit(txStatus);

        return 1;
    }
}
