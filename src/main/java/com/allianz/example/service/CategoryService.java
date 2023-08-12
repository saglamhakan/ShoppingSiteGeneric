package com.allianz.example.service;

import com.allianz.example.database.entity.CategoryEntity;
import com.allianz.example.database.repository.CategoryEntityRepository;
import com.allianz.example.mapper.CategoryMapper;
import com.allianz.example.model.CategoryDTO;
import com.allianz.example.model.requestDTO.CategoryRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CategoryService extends BaseService<CategoryDTO, CategoryEntity, CategoryRequestDTO> {

    @Autowired
    CategoryEntityRepository categoryEntityRepository;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    protected JpaRepository<CategoryEntity, UUID> getRepository() {
        return categoryEntityRepository;
    }

    @Override
    protected CategoryDTO entityToDTO(CategoryEntity entity) {
        return categoryMapper.entityToDTO(entity);
    }

    @Override
    protected CategoryEntity dtoToEntity(CategoryRequestDTO categoryRequestDTO) {
        return categoryMapper.requestDTOToEntity(categoryRequestDTO);
    }

    @Override
    protected CategoryEntity requestDtoToExistEntity(CategoryRequestDTO dto, CategoryEntity entity) {
        return categoryMapper.requestDtoToExistEntity(dto,entity);
    }
}
