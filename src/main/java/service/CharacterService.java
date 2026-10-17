package service;

import org.springframework.stereotype.Service;
import model.Character;

import java.util.List;

@Service
public class CharacterService {

    public List<Character> getAllCharacters() {
        return List.of();
    }
}
