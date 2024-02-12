package com.sjt.userService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter @Builder
public class User {

    @Id
    Integer id;
    String name;
}
