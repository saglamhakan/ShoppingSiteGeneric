package com.allianz.example.model.requestDTO;

import com.allianz.example.model.enums.OrderStatusEnum;
import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderRequestDTO extends BaseRequestDTO {

    private CustomerRequestDTO customer;
    private OrderStatusEnum orderStatus;
    private List<OrderItemRequestDTO> orderItemList;
    private BigDecimal totalSellPrice;
}
