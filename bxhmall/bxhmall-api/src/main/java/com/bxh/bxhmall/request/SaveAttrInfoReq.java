package com.bxh.bxhmall.request;

import com.bxh.bxhmall.response.AttrValueListResp;
import lombok.Data;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.Serializable;
import java.util.List;

/**
 * @version V1.0
 * @ClassName SaveAttrInfoReq
 * @Description TODO
 * @Author BXH
 * @Date 2020-03-04 16:14
 */
@Data
public class SaveAttrInfoReq implements Serializable {

    private Integer id;

    private String attrName;

    private String catalogId;

    private List<AttrValueListResp> attrValueList;

}
