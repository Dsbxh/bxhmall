package com.bxh.bxhmall.response;

import lombok.Data;

import java.io.Serializable;

/**
 * @version V1.0
 * @ClassName AttrValueListResp
 * @Description 属性值列表
 * @Author BXH
 * @Date 2020-03-4 14:18
 */
@Data
public class AttrValueListResp implements Serializable {

    private Integer id;

    private String valueName;

    private String isEnabled;

}
