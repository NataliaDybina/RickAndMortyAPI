package org.example.rickandmortyapi.controller;

import org.springframework.web.bind.annotation.*;
import org.example.rickandmortyapi.service.CharacterService;
import org.example.rickandmortyapi.model.CharacterDTO;

import java.util.List;

@RestController
@RequestMapping("/rickandmortyapi/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<CharacterDTO> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/{id}")
    public CharacterDTO getCharacterById(@PathVariable int id) {
        return characterService.getCharacterById(id);
    }

    @GetMapping("/")
    public List<CharacterDTO> getCharactersFilter(@RequestParam String status) {
        return characterService.getCharactersFilter(status);
    }

    @GetMapping("/amount")
    public int getAmountOfCharactersPerStatus(@RequestParam String status) {
        return characterService.getAmountOfCharactersPerStatus(status);
    }
}
