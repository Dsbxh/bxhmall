package com.bxh.bxhmallmanagerweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bxh.bxhmall.request.SaveAttrInfoReq;
import com.bxh.bxhmall.response.GetAttrValueResp;
import com.bxh.bxhmall.response.PmsBaseAttrInfo;
import com.bxh.bxhmall.response.PmsBaseCatalogBase;
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
@CrossOrigin
public class ManagerController {

    @Reference(timeout = 60000,retries = 3)
    private ManagerService managerService;


    @RequestMapping(path = "getCatalog",method = RequestMethod.GET)
    public List<PmsBaseCatalogBase> getCatalog(@RequestParam(required = true) Integer catalogId){
        return managerService.getCatalog(catalogId);
    }


    @RequestMapping(path = "attrInfoList",method = RequestMethod.GET)
    public List<PmsBaseAttrInfo> getAttrInfoByCatalogId(@RequestParam(required = true) Integer catalogId){
        return managerService.getAttrInfoByCatalogId(catalogId);
    }


    @RequestMapping(path = "getAttrValueList",method = RequestMethod.GET)
    public GetAttrValueResp getAttrValueList(@RequestParam(required = true) Integer attrId){
        return managerService.getAttrValueList(attrId);
    }


    @RequestMapping(path = "saveAttrInfo",method = RequestMethod.POST)
    public String saveAttrInfo(@RequestBody SaveAttrInfoReq req){
        boolean flag = managerService.saveAttrInfo(req);
        return req.getCatalogId();
    }

}
