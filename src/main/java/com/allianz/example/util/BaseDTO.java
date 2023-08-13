package com.allianz.example.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


import java.util.Date;
import java.util.UUID;

@Data
public class BaseDTO {

    @JsonIgnore
    private Long id;
    private UUID uuid;
    private Date creationDate;
    private Date updatedDate;


}
