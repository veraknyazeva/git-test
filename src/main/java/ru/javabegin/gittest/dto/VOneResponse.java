package ru.javabegin.gittest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VOneResponse {
    @JsonProperty
    public String name;

    @JsonProperty
    public String firstName;

    @JsonProperty
    public Integer age;
}
