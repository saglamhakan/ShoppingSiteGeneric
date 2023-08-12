package com.allianz.example.service;

import com.allianz.example.database.entity.OrderItemEntity;
import com.allianz.example.database.repository.OrderItemEntityRepository;
import com.allianz.example.mapper.OrderItemMapper;
import com.allianz.example.model.OrderItemDTO;
import com.allianz.example.model.requestDTO.OrderItemRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderItemService extends BaseService<OrderItemDTO, OrderItemEntity, OrderItemRequestDTO> {

    @Autowired
    OrderItemEntityRepository orderItemEntityRepository;

    @Autowired
    OrderItemMapper orderItemMapper;


    @Override
    protected JpaRepository<OrderItemEntity, UUID> getRepository() {
        return orderItemEntityRepository;
    }

    @Override
    protected OrderItemDTO entityToDTO(OrderItemEntity entity) {
        return orderItemMapper.entityToDTO(entity);
    }

    @Override
    protected OrderItemEntity dtoToEntity(OrderItemRequestDTO orderItemRequestDTO) {
        return orderItemMapper.requestDTOToEntity(orderItemRequestDTO);
    }

    @Override
    protected OrderItemEntity requestDtoToExistEntity(OrderItemRequestDTO dto, OrderItemEntity entity) {
        return orderItemMapper.requestDtoToExistEntity(dto, entity);
    }
}
