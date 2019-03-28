package com.neuedu.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2019/3/21.
 */
@Data
public class Product {
    private Integer id;
    private String name;
    private String type;
    private String brand;
    private BigDecimal price;
    private Integer isDel;
}
