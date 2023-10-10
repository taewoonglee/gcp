package com.example.gcp.controller;

import com.example.gcp.domain.entity.MyUser;
import com.example.gcp.domain.request.UserRequest;
import com.example.gcp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
//34.30.61.51
@CrossOrigin("http://localhost:3000")
public class UserController {
    private final UserService userService;
    @PostMapping
    public void save(@RequestBody UserRequest userRequest)
    {
        userService.save(userRequest);
    }
    @GetMapping
    public List<MyUser> getAll()
    {
        return userService.getAll();
    }


}
