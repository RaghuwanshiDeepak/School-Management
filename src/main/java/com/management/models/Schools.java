package com.management.models;

import javax.persistence.*;

@Entity
@Table(name = "school_details")
public class Schools {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "school_name")
    private String schoolName;


}
