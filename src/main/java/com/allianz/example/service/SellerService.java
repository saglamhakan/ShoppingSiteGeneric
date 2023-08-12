package com.allianz.example.service;

import com.allianz.example.database.entity.SellerEntity;
import com.allianz.example.database.repository.SellerEntityRepository;
import com.allianz.example.mapper.SellerMapper;
import com.allianz.example.model.SellerDTO;
import com.allianz.example.model.requestDTO.SellerRequestDTO;
import com.allianz.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SellerService extends BaseService<SellerDTO, SellerEntity, SellerRequestDTO> {
	@Autowired
	SellerEntityRepository sellerRepository;
	@Autowired
	SellerMapper sellerMapper;


	@Override
	protected JpaRepository<SellerEntity, UUID> getRepository() {
		return sellerRepository;
	}

	@Override
	protected SellerDTO entityToDTO(SellerEntity entity) {
		return sellerMapper.entityToDTO(entity);
	}

	@Override
	protected SellerEntity dtoToEntity(SellerRequestDTO sellerRequestDTO) {
		return sellerMapper.requestDTOToEntity(sellerRequestDTO);
	}

	@Override
	protected SellerEntity requestDtoToExistEntity(SellerRequestDTO dto, SellerEntity entity) {
		return sellerMapper.requestDtoToExistEntity(dto,entity);
	}
}
