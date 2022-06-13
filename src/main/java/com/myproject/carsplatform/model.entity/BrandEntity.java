package com.myproject.carsplatform.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "brands")
public class BrandEntity extends BaseEntity{

    private String name;
}
