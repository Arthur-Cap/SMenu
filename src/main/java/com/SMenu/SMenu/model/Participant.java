package com.SMenu.SMenu.model;

import com.SMenu.SMenu.model.core.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "participant")
public class Participant extends BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Transient // Bỏ qua trường này khi tạo bảng
    private Long id;
    private String agencyId;
    private Long shopId;
    private String role;
    private String participantStatus;
}
