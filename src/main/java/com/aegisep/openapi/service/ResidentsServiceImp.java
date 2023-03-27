package com.aegisep.openapi.service;

import com.aegisep.openapi.mapper.ResidentsMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

@Slf4j
@Service
@AllArgsConstructor
public class ResidentsServiceImp implements ResidentsService {
    @Autowired
    ResidentsMapper residentsMapper;

    private final PlatformTransactionManager transactionManager;
    @Override
    public String getSysdate() {
        return residentsMapper.getSysdate();
    }

}
