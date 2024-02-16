package com.gatblac.demo.controller;


import com.gatblac.demo.dto.Persona;
import com.gatblac.demo.service.PersonasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("persona")
public class ListInfoController {

    @Autowired
    PersonasService personasService;

    @PostMapping("countingVowels")
    ResponseEntity<String> countVowels(@RequestBody Persona persona){

        System.out.println(persona);
        int totalVowels = personasService.countVowels(persona);
        String msj = "Su nombre contiene : "+ totalVowels + " vocales";
        return new ResponseEntity<>(msj, HttpStatusCode.valueOf(200));
    }

}
