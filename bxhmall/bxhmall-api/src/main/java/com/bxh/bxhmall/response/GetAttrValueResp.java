package com.bxh.bxhmall.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @version V1.0
 * @ClassName GetAttrValueResp
 * @Description 获取属性值响应实体
 * @Author BXH
 * @Date 14:17
 */
@Data
public class GetAttrValueResp  implements Serializable {

    private Integer attrId;

    private String attrName;

    private List<AttrValueListResp> data;

}
