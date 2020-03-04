package com.bxh.bxhmallmanagerservice.mapper;

import com.bxh.bxhmall.request.SaveAttrInfoReq;
import com.bxh.bxhmall.response.GetAttrValueResp;
import com.bxh.bxhmall.response.PmsBaseAttrInfo;
import com.bxh.bxhmall.response.PmsBaseCatalogBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {

    List<PmsBaseCatalogBase> selectCatalog(@Param("catalogId") Integer catalogId);

    List<PmsBaseAttrInfo> selectAttrInfoByCatalogId(@Param("catalogId") Integer catalogId);

    GetAttrValueResp selectAttrValueList(@Param("attrId") Integer attrId);

    boolean saveAttrInfo(@Param("req") SaveAttrInfoReq req);

    boolean deleteAttrInfo(@Param("attrId") Integer id);
}
