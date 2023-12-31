package com.example.basic.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "account")
@Entity(name = "WebEntity")
public class WebEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long uid;

    @Column(unique = true)
    private String id;
    private String password;
    private String name;
    private int age;
    private String role;

}
