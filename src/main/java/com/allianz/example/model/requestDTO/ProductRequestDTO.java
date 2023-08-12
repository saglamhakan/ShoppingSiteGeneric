package com.allianz.example.model.requestDTO;

import com.allianz.example.model.enums.ColorEnum;
import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Data
public class ProductRequestDTO extends BaseRequestDTO {

    private String name;
    private String code;
    private ColorEnum color;
    private BigDecimal sellPrice;
    private BigDecimal buyPrice;
    private Integer quantity;
    private Set<CategoryRequestDTO> categoryList;
    private TaxRequestDTO tax;

}
