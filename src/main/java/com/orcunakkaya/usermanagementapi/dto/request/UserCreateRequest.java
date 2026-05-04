package com.orcunakkaya.usermanagementapi.dto.request;

import lombok.Data;

@Data
public class UserCreateRequest {
    private String fullName;
    private String email;
    private Integer age;
}