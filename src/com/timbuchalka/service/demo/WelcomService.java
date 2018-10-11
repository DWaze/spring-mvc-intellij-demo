package com.timbuchalka.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomService implements GenericWelcomService {
    @Override
    public List<String> getWelcomMessage(String name){
        List<String> myWelcomMessage = new ArrayList<>();


        // Add data to the list
        myWelcomMessage.add("Hello");
        myWelcomMessage.add(name);
        myWelcomMessage.add(", Welcome to the spring cours");


        return myWelcomMessage;
    }
}
