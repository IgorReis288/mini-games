package com.example.mini.games.thirdparty.client;

import com.example.mini.games.common.BaseClient;
import org.springframework.stereotype.Component;

@Component
public class PokeAPIClient extends BaseClient {

    private final String URL_BASE_POKE_API = "https://pokeapi.co/api/v2/";
    private final String URL_POKE_API_TYPE = URL_BASE_POKE_API + "type/";
    private final String URL_POKE_API_MOVE = URL_BASE_POKE_API + "move/";
    private final String URL_POKE_API_POKEMON = URL_BASE_POKE_API + "pokemon/";

    public String getPokemonTypes(String id) {
        try {
            return restTemplate().getForObject(URL_POKE_API_TYPE + id, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getPokemon(String id) {
        try {
            return restTemplate().getForObject(URL_POKE_API_MOVE + id, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String getPokemonMove(String id) {
        try {
            return restTemplate().getForObject(URL_POKE_API_POKEMON + id, String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
