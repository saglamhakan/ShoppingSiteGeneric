package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderItemRequestDTO extends BaseRequestDTO {
    private ProductRequestDTO product;
    private Integer quantity;
    private BigDecimal sellPrice;
}
