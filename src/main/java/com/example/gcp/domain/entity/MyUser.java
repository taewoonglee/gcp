package com.example.gcp.domain.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "myusers")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MyUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
}
