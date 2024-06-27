package com.gl.app.EmployeeApplication.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeApplicationController {

    @GetMapping
    public ResponseEntity<String> getEmployees(){
        return new ResponseEntity<>("Employee details", HttpStatus.OK);
    }
}
