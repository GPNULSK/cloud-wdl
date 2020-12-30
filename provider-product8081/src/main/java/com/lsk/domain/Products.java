package com.lsk.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_products
 * @author 
 */
@Data
public class Products implements Serializable {
    private Integer pid;

    private String productName;

    private String productDesc;

    private Integer inventory;

    private static final long serialVersionUID = 1L;
}