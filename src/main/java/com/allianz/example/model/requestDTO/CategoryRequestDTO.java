package com.allianz.example.model.requestDTO;

import com.allianz.example.util.BaseDTO;
import com.allianz.example.util.BaseRequestDTO;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class CategoryRequestDTO extends BaseRequestDTO {
    private String name;
    private Set<ProductRequestDTO> productList = new HashSet<>();
}
