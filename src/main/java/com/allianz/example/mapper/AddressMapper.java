package com.allianz.example.mapper;

import com.allianz.example.database.entity.AddressEntity;
import com.allianz.example.database.entity.SettingEntity;
import com.allianz.example.model.AddressDTO;
import com.allianz.example.model.requestDTO.AddressRequestDTO;
import com.allianz.example.util.IBaseMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AddressMapper implements IBaseMapper<AddressDTO, AddressEntity, AddressRequestDTO> {
    @Override
    public AddressDTO entityToDTO(AddressEntity entity) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setCreationDate(entity.getCreationDate());
        addressDTO.setUuid(entity.getUuid());
        addressDTO.setId(entity.getId());
        addressDTO.setAddress(entity.getAddress());
        addressDTO.setTitle(entity.getTitle());
        addressDTO.setUpdatedDate(entity.getUpdatedDate());


        return addressDTO;
    }

    @Override
    public AddressEntity dtoToEntity(AddressDTO dto) {
        return null;
    }

    @Override
    public List<AddressDTO> entityListToDTOList(List<AddressEntity> addressEntities) {
        List<AddressDTO> addressDTOList = new ArrayList<>();

        for (AddressEntity addressEntity:addressEntities) {
            addressDTOList.add(entityToDTO(addressEntity));
        }
        
        return addressDTOList;
    }

    @Override
    public List<AddressEntity> dtoListTOEntityList(List<AddressDTO> addressDTOS) {
        return null;
    }

    @Override
    public AddressEntity requestDTOToEntity(AddressRequestDTO dto) {
        AddressEntity entity = new AddressEntity();

        entity.setAddress(dto.getAddress());
        entity.setTitle(dto.getTitle());

        return entity;
    }

    @Override
    public List<AddressEntity> requestDtoListTOEntityList(List<AddressRequestDTO> addressRequestDTOS) {
        return null;
    }

    @Override
    public AddressEntity requestDtoToExistEntity(AddressRequestDTO dto, AddressEntity entity) {
        return null;
    }


}
