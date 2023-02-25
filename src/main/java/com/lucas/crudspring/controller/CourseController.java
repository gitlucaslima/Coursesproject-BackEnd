package com.lucas.crudspring.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.crudspring.model.Course;
import com.lucas.crudspring.respository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api-v1/courses")
@Component
@AllArgsConstructor //Constructor com lombock
public class CourseController {
    
    //@Autowired Constructor com autowired
    private final CourseRepository courseRepository; //Final --- quando a instancia não será modificada, garante a integridade

    // @RequestMapping(method = RequestMethod.GET)

    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }

}
