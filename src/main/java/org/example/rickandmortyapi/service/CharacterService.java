package org.example.rickandmortyapi.service;

import org.example.rickandmortyapi.model.CharacterResponseDTO;
import org.springframework.stereotype.Service;
import org.example.rickandmortyapi.model.CharacterDTO;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class CharacterService {

    private final RestClient restClient;

    public CharacterService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://rickandmortyapi.com/api")
                .build();
    }

    public List<CharacterDTO> getAllCharacters() {
        return restClient.get()
                .uri("/character")
                .retrieve()
                .body(CharacterResponseDTO.class).results();
    }

    public CharacterDTO getCharacterById(int id) {
        return restClient.get()
                .uri("/character/" + id)
                .retrieve()
                .body(CharacterDTO.class);
    }

    public List<CharacterDTO> getCharactersFilter(String status) {
        return restClient.get()
                .uri("/character/?status=" + status)
                .retrieve()
                .body(CharacterResponseDTO.class).results();
    }

    public int getAmountOfCharactersPerStatus(String status) {
        return restClient.get()
                .uri("/character/?status=" + status)
                .retrieve()
                .body(CharacterResponseDTO.class).info().count();
    }
}
