package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "menuContent")
public class MenuContent extends BaseModel{
    private Long id;
    private String menuId;
    private  String itemId;
    private  Boolean status;
}