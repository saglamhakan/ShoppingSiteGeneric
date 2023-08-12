package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BillRequestDTO extends BaseRequestDTO {
    private String billNo;
    private LocalDateTime billDate;
    private BigDecimal taxRate;
    private BigDecimal taxAmount;
    private BigDecimal totalSellNetPrice;
    private BigDecimal totalSellPrice;
    private OrderRequestDTO order;
}
