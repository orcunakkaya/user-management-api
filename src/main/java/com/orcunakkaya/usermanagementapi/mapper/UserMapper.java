package com.orcunakkaya.usermanagementapi.mapper;

import com.orcunakkaya.usermanagementapi.dto.request.UserCreateRequest;
import com.orcunakkaya.usermanagementapi.dto.response.UserResponse;
import com.orcunakkaya.usermanagementapi.entity.User;

public class UserMapper {

    public static User toEntity(UserCreateRequest request) {
        return User.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .age(request.getAge())
                .build();
    }

    public static UserResponse toResponse(User user) {
        return UserResponse.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .age(user.getAge())
                .build();
    }
}