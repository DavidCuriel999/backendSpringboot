package com.friendlys.app.friendlysAppofficial.controllers;

import com.friendlys.app.friendlysAppofficial.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")

public class StudentController {

    // Lista de recursos
    private List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1, "Laura Gracia", "Laura.g@mail.com", 21,"Ciencias de la computacion")
    ));

}
