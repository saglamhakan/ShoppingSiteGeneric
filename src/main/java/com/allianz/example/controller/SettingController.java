package com.allianz.example.controller;

import com.allianz.example.database.entity.SettingEntity;
import com.allianz.example.model.SettingDTO;
import com.allianz.example.model.requestDTO.SettingRequestDTO;
import com.allianz.example.service.SettingService;
import com.allianz.example.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("setting")
public class SettingController extends BaseController<SettingDTO, SettingEntity, SettingRequestDTO, SettingService> {

    @Autowired
    SettingService settingService;


    @Override
    protected SettingService getBaseService() {
        return settingService;
    }
}
