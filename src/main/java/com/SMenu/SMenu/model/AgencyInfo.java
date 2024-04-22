package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "agencyInfo")
public class AgencyInfo extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String agencyName;
    private String phoneNumber;
    private String email;
    private String destination;
    private String avatar;

}
