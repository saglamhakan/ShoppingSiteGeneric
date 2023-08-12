package com.allianz.example.service;

import com.allianz.example.database.entity.AddressEntity;
import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.database.entity.ProductEntity;
import com.allianz.example.database.repository.PersonEntityRepository;
import com.allianz.example.database.repository.ProductEntityRepository;
import com.allianz.example.mapper.ProductMapper;
import com.allianz.example.model.AddressDTO;
import com.allianz.example.model.PersonDTO;
import com.allianz.example.model.ProductDTO;
import com.allianz.example.model.requestDTO.AddressRequestDTO;
import com.allianz.example.model.requestDTO.PersonRequestDTO;
import com.allianz.example.model.requestDTO.ProductRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService extends BaseService<ProductDTO, ProductEntity, ProductRequestDTO> {

    @Autowired
    ProductEntityRepository productEntityRepository;

    @Autowired
    ProductMapper productMapper;


    @Override
    protected JpaRepository<ProductEntity, UUID> getRepository() {
        return productEntityRepository;
    }

    @Override
    protected ProductDTO entityToDTO(ProductEntity entity) {
        return productMapper.entityToDTO(entity);
    }

    @Override
    protected ProductEntity dtoToEntity(ProductRequestDTO productRequestDTO) {
        return productMapper.requestDTOToEntity(productRequestDTO);
    }

    @Override
    protected ProductEntity requestDtoToExistEntity(ProductRequestDTO dto, ProductEntity entity) {
        return productMapper.requestDtoToExistEntity(dto,entity);
    }
}
