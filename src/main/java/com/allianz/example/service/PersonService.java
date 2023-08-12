package com.allianz.example.service;

import com.allianz.example.database.entity.PersonEntity;
import com.allianz.example.database.repository.PersonEntityRepository;
import com.allianz.example.mapper.PersonMapper;
import com.allianz.example.model.PersonDTO;
import com.allianz.example.model.requestDTO.PersonRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

//bean
@Service
public class PersonService extends BaseService<PersonDTO, PersonEntity, PersonRequestDTO> {

    @Autowired
    PersonEntityRepository personEntityRepository;

    @Autowired
    PersonMapper personMapper;


    @Override
    protected JpaRepository<PersonEntity, UUID> getRepository() {
        return personEntityRepository;
    }

    @Override
    protected PersonDTO entityToDTO(PersonEntity entity) {
        return personMapper.entityToDTO(entity);
    }

    @Override
    protected PersonEntity dtoToEntity(PersonRequestDTO personRequestDTO) {
        return personMapper.requestDTOToEntity(personRequestDTO);
    }

    @Override
    protected PersonEntity requestDtoToExistEntity(PersonRequestDTO dto, PersonEntity entity) {
        return personMapper.requestDtoToExistEntity(dto,entity);
    }
}
