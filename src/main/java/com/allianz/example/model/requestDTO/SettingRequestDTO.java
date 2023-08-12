package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

@Data
public class SettingRequestDTO extends BaseRequestDTO {
    private String key;
    private String value;
}
