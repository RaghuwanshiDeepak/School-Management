package com.management.models;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentId")
    private Long id;

    @Column(name = "studentName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "fee")
    private Long fees;

    @Column(name = "branch")
    private String branchName;

    @OneToOne
    private Schools schoolName;

}
