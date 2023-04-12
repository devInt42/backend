package com.example.backend.controller;

import com.example.backend.service.ExampleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/example")
public class Example {

    @Autowired
    private ExampleServiceImpl exampleService;

    @GetMapping("/all")
    public List<Object> getAllExample (){
        List<Object> result = exampleService.getAllExample();
        return result;
    }
}
