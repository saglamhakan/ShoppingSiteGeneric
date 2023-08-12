package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxRequestDTO extends BaseRequestDTO {

    private String name;
    private String code;
    private BigDecimal rate;
}
