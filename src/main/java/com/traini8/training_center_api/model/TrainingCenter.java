package com.traini8.training_center_api.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "training_centers")
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    @Column(unique = true, length = 12)
    private String centerCode;

    @NotNull
    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;
    
    @Column(nullable = false, updatable = false)
    private long createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^[0-9]{10}$")
    private String contactPhone;

    @PrePersist
    public void prePersist() {
        this.createdOn = System.currentTimeMillis();
    }
}