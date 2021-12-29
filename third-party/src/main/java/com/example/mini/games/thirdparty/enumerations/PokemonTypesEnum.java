package com.example.mini.games.thirdparty.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PokemonTypesEnum {

    NORMAL("normal", 1),
    FIGHTING("fighting", 2),
    FLYING("flying", 3),
    POISON("poison", 4),
    GROUND("ground", 5),
    ROCK("rock", 6),
    BUG("bug", 7),
    GHOST("ghost", 8),
    STEEL("steel", 9),
    FIRE("fire", 10),
    WATER("water", 11),
    GRASS("grass", 12),
    ELECTRIC("electric", 13),
    PSYCHIC("psychic", 14),
    ICE("ice", 15),
    DRAGON("dragon", 16),
    DARK("dark", 17),
    FAIRY("fairy", 18),
    UNKNOWN("unknown", 10001),
    SHADOW("shadow", 10002);

    private final String description;
    private final Integer idPokeApi;
}

