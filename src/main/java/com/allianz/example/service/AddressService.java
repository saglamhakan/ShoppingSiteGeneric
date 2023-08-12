package com.allianz.example.service;

import com.allianz.example.database.entity.AddressEntity;
import com.allianz.example.database.repository.AddressEntityRepository;
import com.allianz.example.mapper.AddressMapper;
import com.allianz.example.model.AddressDTO;
import com.allianz.example.model.requestDTO.AddressRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressService extends BaseService<AddressDTO, AddressEntity, AddressRequestDTO> {

    @Autowired
    AddressEntityRepository addressEntityRepository;

    @Autowired
    AddressMapper addressMapper;


    @Override
    protected JpaRepository<AddressEntity, UUID> getRepository() {
        return addressEntityRepository;
    }

    @Override
    protected AddressDTO entityToDTO(AddressEntity entity) {
        return addressMapper.entityToDTO(entity);
    }

    @Override
    protected AddressEntity dtoToEntity(AddressRequestDTO addressRequestDTO) {
        return addressMapper.requestDTOToEntity(addressRequestDTO);
    }

    @Override
    protected AddressEntity requestDtoToExistEntity(AddressRequestDTO dto, AddressEntity entity) {
        return addressMapper.requestDtoToExistEntity(dto,entity);
    }
}
