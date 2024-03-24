package org.example.wygotest.controller;

import org.example.wygotest.model.Test;
import org.example.wygotest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestRepository testRepository;

    @PostMapping("/test")
    Test newTest(@RequestBody Test newTest){
        return testRepository.save(newTest);
    }
}
