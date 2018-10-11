package com.timbuchalka.springdemo.controller;

import com.timbuchalka.service.demo.GenericWelcomService;
import com.timbuchalka.service.demo.WelcomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WelcomeController {


    @Autowired
    private GenericWelcomService welcomService;


    @RequestMapping("/")
    public String doWelcom(Model model){
        // 1. Retrieve the processed data
//        WelcomService welcomService = new WelcomService();
        List<String> welcomMessages = welcomService.getWelcomMessage("Tim Buchalka");

        // 2. Add data to the model
        model.addAttribute("myWelcomeMessage", welcomMessages);

        //3. Return logical view name
        return "welcomNew";
    }

}
