package com.management.controller;

import com.management.dto.StudentDto;
import com.management.serviceLayer.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {


    @Autowired
    StudentInterface studentInterface;

}
