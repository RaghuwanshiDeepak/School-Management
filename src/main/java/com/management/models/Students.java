package com.management.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Students {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentId")
    private Long id;

    @Column(name = "studentName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "fee")
    private Long fees;


}
