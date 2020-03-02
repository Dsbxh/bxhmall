package com.bxh.bxhmallmanagerservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bxh.bxhmall.beans.PmsBaseCatalogBase;
import com.bxh.bxhmall.service.ManagerService;
import com.bxh.bxhmallmanagerservice.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @version V1.0
 * @ClassName ManagerServiceImpl
 * @Description TODO
 * @Author BXH
 * @Date 2020.03.02 13:26
 */
@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;



    @Override
    public List<PmsBaseCatalogBase> getCatalog(Integer catalogId) {
        return managerMapper.selectCatalog(catalogId);
    }
}
