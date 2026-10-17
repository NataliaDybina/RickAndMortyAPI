package org.example.rickandmortyapi.model;

public record CharacterDTO(int id, String name, String status, String species,
                           EntityReferenceDTO origin, EntityReferenceDTO location) {
}
