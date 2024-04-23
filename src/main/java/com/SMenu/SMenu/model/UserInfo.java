package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "userInfo")
public class UserInfo extends BaseModel {
    private String name;
    private Integer phoneNumber;
    private String email;
    private String destination;
    private String avatar;

}
