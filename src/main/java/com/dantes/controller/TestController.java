package com.dantes.controller;

import com.dantes.repository.UserRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@AllArgsConstructor
public class TestController {
    UserRepository userRepository;

    @GetMapping("/")
    public void test() {
        System.out.println(userRepository.findAll());
    }
}
