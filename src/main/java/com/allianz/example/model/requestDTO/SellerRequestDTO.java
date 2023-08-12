package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

@Data
public class SellerRequestDTO extends BaseRequestDTO {

    private String name;
    private String surname;
    private String tc;
    private String email;
    private String shopName;
    private String taxNumber;
    private String taxOffice;

}
