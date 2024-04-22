package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "item")
public class Item extends BaseModel {
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    private String imageLink;
    private String video;
    private String creatorId;

}

