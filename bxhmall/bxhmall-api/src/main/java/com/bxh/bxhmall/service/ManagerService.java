package com.bxh.bxhmall.service;

import com.bxh.bxhmall.beans.PmsBaseCatalogBase;

import java.util.List;

public interface ManagerService {

    /**
     * 获取一级分类
     **/

    List<PmsBaseCatalogBase> getCatalog(Integer catalogId);
}
