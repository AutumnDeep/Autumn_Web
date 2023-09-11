package com.Autumn.AutumnWeb.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
