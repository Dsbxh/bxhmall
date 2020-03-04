package com.bxh.bxhmall.service;

import com.bxh.bxhmall.request.SaveAttrInfoReq;
import com.bxh.bxhmall.response.GetAttrValueResp;
import com.bxh.bxhmall.response.PmsBaseAttrInfo;
import com.bxh.bxhmall.response.PmsBaseCatalogBase;

import java.util.List;

public interface ManagerService {

    /**
     * 获取一级分类
     **/

    List<PmsBaseCatalogBase> getCatalog(Integer catalogId);

    List<PmsBaseAttrInfo> getAttrInfoByCatalogId(Integer catalogId);

    GetAttrValueResp getAttrValueList(Integer attrId);

    boolean saveAttrInfo(SaveAttrInfoReq req);
}
