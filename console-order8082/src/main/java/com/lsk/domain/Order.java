package com.lsk.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * t_order
 * @author 
 */
@Data
public class Order implements Serializable {
    private Integer rid;

    private String uid;

    private String ruuid;

    private String produceName;

    private Integer account;

    private static final long serialVersionUID = 1L;
}