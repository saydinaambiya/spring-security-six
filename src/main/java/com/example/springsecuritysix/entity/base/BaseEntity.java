package com.example.springsecuritysix.entity.base;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    //Strategy for increment ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
