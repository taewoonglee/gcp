package com.example.gcp.service;

import com.example.gcp.domain.entity.MyUser;
import com.example.gcp.domain.request.UserRequest;
import com.example.gcp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public void save(UserRequest userRequest)
    {
        userRepository.save(userRequest.toEntity());
    }
    public List<MyUser> getAll()
    {
        return userRepository.findAll();
    }

}
