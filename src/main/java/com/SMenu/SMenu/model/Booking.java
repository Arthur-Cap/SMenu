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
@Table(name = "booking")
public class Booking extends BaseModel {
    private Long itemId;
    private Long tableHostId;
    private String paymentStatus;
}
