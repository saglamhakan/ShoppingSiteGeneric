package com.allianz.example.service;

import com.allianz.example.database.entity.BillEntity;
import com.allianz.example.database.repository.BillEntityRepository;
import com.allianz.example.mapper.BillMapper;
import com.allianz.example.model.BillDTO;
import com.allianz.example.model.requestDTO.BillRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BillService extends BaseService<BillDTO, BillEntity, BillRequestDTO> {

    @Autowired
    BillEntityRepository billEntityRepository;

    @Autowired
    BillMapper billMapper;

    @Override
    protected JpaRepository<BillEntity, UUID> getRepository() {
        return billEntityRepository;
    }

    @Override
    protected BillDTO entityToDTO(BillEntity entity) {
        return billMapper.entityToDTO(entity);
    }

    @Override
    protected BillEntity dtoToEntity(BillRequestDTO billRequestDTO) {
        return billMapper.requestDTOToEntity(billRequestDTO);
    }

    @Override
    protected BillEntity requestDtoToExistEntity(BillRequestDTO dto, BillEntity entity) {
        return billMapper.requestDtoToExistEntity(dto,entity);
    }
}
