package ru.javabegin.gittest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.javabegin.gittest.dto.VOneResponse;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{id}")
    public VOneResponse getNameById(@PathVariable Long id){
        return null;
    }
}
