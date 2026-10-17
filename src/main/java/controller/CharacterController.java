package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CharacterService;
import model.Character;

import java.util.List;

@RestController
@RequestMapping("/rickandmortyapi/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }
}
