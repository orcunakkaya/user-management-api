package com.orcunakkaya.usermanagementapi.service;

import com.orcunakkaya.usermanagementapi.dto.request.UserCreateRequest;
import com.orcunakkaya.usermanagementapi.dto.response.UserResponse;
import com.orcunakkaya.usermanagementapi.entity.User;
import com.orcunakkaya.usermanagementapi.exception.UserNotFoundException;
import com.orcunakkaya.usermanagementapi.mapper.UserMapper;
import com.orcunakkaya.usermanagementapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<UserResponse> getUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toResponse)
                .toList();
    }

    public UserResponse getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return UserMapper.toResponse(user);
    }
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserResponse createUser(UserCreateRequest request) {
        User user = UserMapper.toEntity(request);
        User savedUser = userRepository.save(user);
        return UserMapper.toResponse(savedUser);
    }
}
