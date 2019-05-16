package com.example.dog_301_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    DogRepo dogRepo;

    @GetMapping("/add")
    public String jobform(Model model){
        model.addAttribute("dog", new Dog());
        return"form";
    }

    @PostMapping("/process")
    public String processForm(@Valid Dog dog, BindingResult result){
        if(result.hasErrors()){
            return"form";
        }
        dogRepo.save(dog);
        return "saved";
    }



}
