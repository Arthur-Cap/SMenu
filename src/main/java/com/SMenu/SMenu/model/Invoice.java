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
@Table(name = "invoice")
public class Invoice extends BaseModel {
    private Long shopId;
    private String creator;
    private BigDecimal tax;
    private BigDecimal charge; //money ?
}