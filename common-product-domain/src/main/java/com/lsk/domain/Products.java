package com.lsk.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * t_products
 *
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