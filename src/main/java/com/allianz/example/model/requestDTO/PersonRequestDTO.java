package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

@Data
public class PersonRequestDTO extends BaseRequestDTO {

    private String name;
    private String surname;
    private int birthYear;
    private String tc;

}
