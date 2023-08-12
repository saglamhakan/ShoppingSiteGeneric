package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

@Data
public class PersonTCRequestDTO extends BaseRequestDTO {
    private String tc;
}
