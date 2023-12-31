package com.allianz.example.controller;

import com.allianz.example.database.entity.TaxEntity;
import com.allianz.example.model.TaxDTO;
import com.allianz.example.model.requestDTO.TaxRequestDTO;
import com.allianz.example.service.TaxService;
import com.allianz.example.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tax")
public class TaxController extends BaseController<TaxDTO, TaxEntity, TaxRequestDTO, TaxService> {
	@Autowired
	private TaxService taxService;

	@Override
	protected TaxService getBaseService() {
		return taxService;
	}

}
