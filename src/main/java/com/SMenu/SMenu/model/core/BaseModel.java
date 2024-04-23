package com.SMenu.SMenu.model.core;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @Column(updatable = false, name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

//    @Column(name = "created_at")
//    private LocalDateTime createdAt;
//
//    @Column(name = "deleted_at")
//    private LocalDateTime deletedAt;
//
//    @PrePersist
//    protected void onCreate() {
//        if (this.createdAt == null) {
//            this.createdAt = LocalDateTime.now();
//        }
//    }
//    @PreUpdate
//    protected void onUpdate() {
//        this.createdAt = LocalDateTime.now();
//    }
}
