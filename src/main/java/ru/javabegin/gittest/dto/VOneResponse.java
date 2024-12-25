package ru.javabegin.gittest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VOneResponse {
    @JsonProperty
    private String name;

    @JsonProperty
    private String firstName;

    @JsonProperty
    private Integer age;
}
