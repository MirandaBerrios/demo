package com.gatblac.demo;


import com.gatblac.demo.dto.Persona;
import com.gatblac.demo.service.impl.PersonaServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestControllerListInfo {

    @Mock
    private Persona persona;

    @InjectMocks
    private PersonaServiceImpl personaService;

    @Test
    @DisplayName("Caso general: un nombre con una vocal")
    public void testCountVowelsGeneralCase() {
        Mockito.when(persona.getName()).thenReturn("John");
        assertEquals(1, personaService.countVowels(persona));
    }

    @Test
    @DisplayName("Caso sin vocales: un nombre sin vocales")
    public void testCountVowelsNoVowelsCase() {
        Mockito.when(persona.getName()).thenReturn("Rhythm");
        assertEquals(0, personaService.countVowels(persona));
    }

    @Test
    @DisplayName("Caso con muchas vocales: un nombre con cinco vocales")
    public void testCountVowelsManyVowelsCase() {
        Mockito.when(persona.getName()).thenReturn("AeioU");
        assertEquals(5, personaService.countVowels(persona));
    }

    @Test
    @DisplayName("Caso con vocales con tilde: un nombre con cinco vocales con tilde")
    public void testCountVowelsVowelsWithAccentCase() {
        Mockito.when(persona.getName()).thenReturn("ÁéíÓú");
        assertEquals(0, personaService.countVowels(persona));
    }

}
