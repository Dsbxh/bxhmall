package com.bxh.bxhmallmanagerservice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.bxh.bxhmall.request.SaveAttrInfoReq;
import com.bxh.bxhmall.response.GetAttrValueResp;
import com.bxh.bxhmall.response.PmsBaseAttrInfo;
import com.bxh.bxhmall.response.PmsBaseCatalogBase;
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

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoByCatalogId(Integer catalogId) {
        return managerMapper.selectAttrInfoByCatalogId(catalogId);
    }

    @Override
    public GetAttrValueResp getAttrValueList(Integer attrId) {
        return managerMapper.selectAttrValueList(attrId);
    }

    @Override
    public boolean saveAttrInfo(SaveAttrInfoReq req) {
        if(req.getAttrValueList() == null || req.getAttrValueList().size() == 0){
            return managerMapper.deleteAttrInfo(req.getId());
        }
        return managerMapper.saveAttrInfo(req);
    }
}
