package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

@Data
public class AddressRequestDTO extends BaseRequestDTO {

    private String title;
    private String address;
}
