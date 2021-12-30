package com.example.mini.games.business.slotMachine.service;

import com.example.mini.games.business.slotMachine.gateway.SlotMachineGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SlotMachineService {

    @Autowired
    SlotMachineGateway gateway;

    public String getPokemonTypes(String id){
        return gateway.getPokemonType(id);
    }
}
