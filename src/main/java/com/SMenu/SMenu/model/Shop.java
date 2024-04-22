package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "shop")
public class Shop extends BaseModel {
    private String name;
    private String ownerId;
    private String accessCode;
    private Time refreshCodeTime;
    private String location;
}