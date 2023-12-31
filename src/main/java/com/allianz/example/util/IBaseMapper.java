package com.allianz.example.util;

import com.allianz.example.database.entity.SettingEntity;
import com.allianz.example.model.requestDTO.SettingRequestDTO;
import com.allianz.example.util.dbutil.BaseEntity;

import java.util.List;

public interface IBaseMapper<DTO extends BaseDTO, Entity extends BaseEntity, RequestDTO extends BaseRequestDTO> {

    DTO entityToDTO(Entity entity);

    Entity dtoToEntity(DTO dto);

    List<DTO> entityListToDTOList(List<Entity> entityList);

    List<Entity> dtoListTOEntityList(List<DTO> dtoList);

    Entity requestDTOToEntity(RequestDTO dto);

    List<Entity> requestDtoListTOEntityList(List<RequestDTO> dtoList);
    Entity requestDtoToExistEntity(RequestDTO dto, Entity entity);


}
