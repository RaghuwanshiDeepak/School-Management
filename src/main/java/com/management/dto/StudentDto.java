package com.management.dto;

import com.management.models.Schools;
import lombok.Data;

@Data
public class StudentDto {

    private Long id;
    private String firstName;
    private String lastName;
    private Long fees;
    private String branchName;
    private Schools schoolName;
}
