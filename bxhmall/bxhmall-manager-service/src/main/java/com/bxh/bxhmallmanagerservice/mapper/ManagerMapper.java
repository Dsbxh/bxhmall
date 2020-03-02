package com.bxh.bxhmallmanagerservice.mapper;

import com.bxh.bxhmall.beans.PmsBaseCatalogBase;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ManagerMapper {

    List<PmsBaseCatalogBase> selectCatalog(@Param("catalogId") Integer catalogId);
}
