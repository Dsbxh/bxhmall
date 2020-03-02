package com.bxh.bxhmall.beans;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

/**
 * @param
 * @return
 */
@Data
public class PmsBaseCatalogBase implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;

   /* @Transient
    private List<BaseCatalog2> catalog2s;
   */
}

