package ru.javabegin.gittest.service;

import ru.javabegin.gittest.dto.VOneResponse;

public class TestService {

    public VOneResponse getNameById(Long id) {
        VOneResponse response = new VOneResponse();
        response.setName("name");
        response.setFirstName("firstname");
        response.setAge(10);
        return response;
    }

    public String test(){
        return "hello";
    }
}
