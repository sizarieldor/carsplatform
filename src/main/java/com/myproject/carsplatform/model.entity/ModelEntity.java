package com.myproject.carsplatform.model.entity;

import com.myproject.carsplatform.model.entity.enums.CategoryEnum;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    private String name;
    @Enumerated (EnumType.STRING)
    private CategoryEnum category;
    private String umageUrl;
    private int startYear;
    private Long endYear;

}
