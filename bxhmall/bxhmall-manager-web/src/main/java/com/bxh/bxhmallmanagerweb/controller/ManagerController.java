package com.bxh.bxhmallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bxh.bxhmall.beans.PmsBaseCatalogBase;
import com.bxh.bxhmall.service.ManagerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version V1.0
 * @ClassName ManagerController
 * @Description 基本信息管理Controller
 * @Author BXH
 * @Date 13:22
 */
@RestController
@RequestMapping("manager")
public class ManagerController {

    @Reference(timeout = 60000,retries = 3)
    private ManagerService managerService;


    @RequestMapping(path = "getCatalog",method = RequestMethod.GET)
    @CrossOrigin
    public List<PmsBaseCatalogBase> getCatalog(@RequestParam(required = true) Integer catalogId){
        return managerService.getCatalog(catalogId);
    }


}
