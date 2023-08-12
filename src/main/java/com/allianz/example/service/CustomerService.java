package com.allianz.example.service;

import com.allianz.example.database.entity.CustomerEntity;
import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.database.repository.CustomerEntityRepository;
import com.allianz.example.mapper.CustomerMapper;
import com.allianz.example.model.CustomerDTO;
import com.allianz.example.model.PersonDTO;
import com.allianz.example.model.requestDTO.CustomerRequestDTO;
import com.allianz.example.model.requestDTO.PersonRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService extends BaseService<CustomerDTO, CustomerEntity, CustomerRequestDTO> {

    @Autowired
    CustomerEntityRepository customerEntityRepository;

    @Autowired
    CustomerMapper customerMapper;


    @Override
    protected JpaRepository<CustomerEntity, UUID> getRepository() {
        return customerEntityRepository;
    }

    @Override
    protected CustomerDTO entityToDTO(CustomerEntity entity) {
        return customerMapper.entityToDTO(entity);
    }

    @Override
    protected CustomerEntity dtoToEntity(CustomerRequestDTO customerRequestDTO) {
        return customerMapper.requestDTOToEntity(customerRequestDTO);
    }

    @Override
    protected CustomerEntity requestDtoToExistEntity(CustomerRequestDTO dto, CustomerEntity entity) {
        return customerMapper.requestDtoToExistEntity(dto, entity);
    }
}
