package com.adoptpet.server.commons.domain;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseImageEntity {

    @CreatedDate
    @Column(name = "reg_date")
    private LocalDateTime regDate;

    @Column(name = "reg_id")
    private String regId;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_type")
    private String imageType;
}
