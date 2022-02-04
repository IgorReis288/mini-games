package com.example.mini.games.thirdparty.adapter;

import com.example.mini.games.business.slotMachine.gateway.SlotMachineGateway;
import com.example.mini.games.thirdparty.client.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SlotMachineAdapter implements SlotMachineGateway {

    @Autowired
    private PokeAPIClient pokeAPIClient;

    @Override
    public String getPokemonType(String id) {
        return pokeAPIClient.getPokemonTypes(id);
    }
}
