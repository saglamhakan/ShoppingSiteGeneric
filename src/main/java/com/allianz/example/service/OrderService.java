package com.allianz.example.service;

import com.allianz.example.database.entity.OrderEntity;
import com.allianz.example.database.repository.OrderEntityRepository;
import com.allianz.example.mapper.OrderMapper;
import com.allianz.example.model.OrderDTO;
import com.allianz.example.model.requestDTO.OrderRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService extends BaseService<OrderDTO, OrderEntity, OrderRequestDTO> {

    @Autowired
    OrderEntityRepository orderEntityRepository;

    @Autowired
    OrderMapper orderMapper;

    @Override
    protected JpaRepository<OrderEntity, UUID> getRepository() {
        return orderEntityRepository;
    }

    @Override
    protected OrderDTO entityToDTO(OrderEntity entity) {
        return orderMapper.entityToDTO(entity);
    }

    @Override
    protected OrderEntity dtoToEntity(OrderRequestDTO orderRequestDTO) {
        return orderMapper.requestDTOToEntity(orderRequestDTO);
    }

    @Override
    protected OrderEntity requestDtoToExistEntity(OrderRequestDTO dto, OrderEntity entity) {
        return orderMapper.requestDtoToExistEntity(dto,entity);
    }
}
