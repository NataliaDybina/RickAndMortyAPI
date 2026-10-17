package org.example.rickandmortyapi.model;

import java.util.List;

public record CharacterResponseDTO(PageInfoDTO info, List<CharacterDTO> results) {
}
