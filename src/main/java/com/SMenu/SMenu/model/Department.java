package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "department")
public class Department extends BaseModel {
    private Long shopId;
    private String name;
    private String mapView;
}
