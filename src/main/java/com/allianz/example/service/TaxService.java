package com.allianz.example.service;

import com.allianz.example.database.entity.SettingEntity;
import com.allianz.example.database.entity.TaxEntity;
import com.allianz.example.database.repository.TaxEntityRepository;
import com.allianz.example.mapper.TaxMapper;
import com.allianz.example.model.TaxDTO;
import com.allianz.example.model.requestDTO.SettingRequestDTO;
import com.allianz.example.model.requestDTO.TaxRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TaxService extends BaseService<TaxDTO, TaxEntity, TaxRequestDTO> {
	@Autowired
	private TaxEntityRepository taxRepository;
	@Autowired
	private TaxMapper taxMapper;


	@Override
	protected JpaRepository<TaxEntity, UUID> getRepository() {
		return taxRepository;
	}

	@Override
	protected TaxDTO entityToDTO(TaxEntity entity) {
		return taxMapper.entityToDTO(entity);
	}

	@Override
	protected TaxEntity dtoToEntity(TaxRequestDTO taxRequestDTO) {
		return taxMapper.requestDTOToEntity(taxRequestDTO);
	}

	@Override
	protected TaxEntity requestDtoToExistEntity(TaxRequestDTO dto, TaxEntity entity) {
		return taxMapper.requestDtoToExistEntity(dto, entity);
	}


}
