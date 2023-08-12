package com.allianz.example.service;

import com.allianz.example.database.entity.SettingEntity;
import com.allianz.example.database.entity.TaxEntity;
import com.allianz.example.database.repository.SettingEntityRepository;
import com.allianz.example.mapper.SettingMapper;
import com.allianz.example.model.SettingDTO;
import com.allianz.example.model.TaxDTO;
import com.allianz.example.model.requestDTO.SettingRequestDTO;
import com.allianz.example.model.requestDTO.TaxRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SettingService extends BaseService<SettingDTO, SettingEntity, SettingRequestDTO> {

    @Autowired
    SettingEntityRepository settingEntityRepository;

    @Autowired
    SettingMapper settingMapper;


    @Override
    protected JpaRepository<SettingEntity, UUID> getRepository() {
        return settingEntityRepository;
    }

    @Override
    protected SettingDTO entityToDTO(SettingEntity entity) {
        return settingMapper.entityToDTO(entity);
    }

    @Override
    protected SettingEntity dtoToEntity(SettingRequestDTO settingRequestDTO) {
        return settingMapper.requestDTOToEntity(settingRequestDTO);
    }

    @Override
    protected SettingEntity requestDtoToExistEntity(SettingRequestDTO dto, SettingEntity entity) {
        return settingMapper.requestDtoToExistEntity(dto, entity);
    }
}

    /*
    @Override
    public SettingDTO save(SettingRequestDTO settingRequestDTO) {
        SettingEntity settingEntity = settingMapper.requestDTOToEntity(settingRequestDTO);
        settingEntityRepository.save(settingEntity);
        return settingMapper.entityToDTO(settingEntity);
    }


    @Override
    public List<SettingDTO> getAll() {
        List<SettingEntity> settingEntities= settingEntityRepository.findAll();
        return settingMapper.entityListToDTOList(settingEntities);
    }

    @Override
    public SettingDTO update(UUID uuid, SettingRequestDTO settingRequestDTO) {
        SettingEntity settingEntity = settingEntityRepository.findByUuid(uuid).orElse(null);
        if (settingEntity == null){
            return null;
        }
        return settingMapper.entityToDTO(settingEntityRepository.save(settingMapper.requestDtoToExistEntity(settingRequestDTO, settingEntity)));
    }

    @Override
    public Boolean delete(UUID uuid) {
        SettingEntity settingEntity = settingEntityRepository.findByUuid(uuid).orElse(null);
        if (settingEntity == null){
            return null;
        }
         settingEntityRepository.delete(settingEntity);
        return true;
    }

    @Override
    public SettingDTO getSettingByUuid(UUID uuid) {
        SettingEntity settingEntity = settingEntityRepository.findByUuid(uuid).orElse(null);
        if (settingEntity==null){
            return null;
        }
        return settingMapper.entityToDTO(settingEntity);
    }

     */

