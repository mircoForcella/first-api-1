package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping
    public String getName(){
        return "Mirco";
    }

    @PostMapping
    public String reverseName(@RequestParam String name){
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse().toString();
    }

}
