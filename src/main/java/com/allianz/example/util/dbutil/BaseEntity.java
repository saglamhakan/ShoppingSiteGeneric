package com.allianz.example.util.dbutil;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;


@MappedSuperclass
@Data
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name = "uuid", unique = true, nullable = false, updatable = false, length = 40)
    @Id
    private UUID uuid;

    @CreatedDate
    private Date creationDate;

    @LastModifiedDate
    private Date updatedDate;


    @PrePersist
    protected void onCreate() {
        setUuid(java.util.UUID.randomUUID());
    }


}
