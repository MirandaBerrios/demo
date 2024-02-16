package com.gatblac.demo.service.impl;

import com.gatblac.demo.dto.Persona;
import com.gatblac.demo.service.PersonasService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonaServiceImpl implements PersonasService {

    private static final Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));


    @Override
    public int countVowels(Persona persona) {
        String name = persona.getName().toLowerCase(); // O toUpperCase()
        char[] letters = name.toCharArray();
        int counter = 0;

        for (char letter : letters) {
            if (vowels.contains(letter)) {
                System.out.println(letter + " : was found it");
                counter++;
            }
        }
        return counter;
    }
}
