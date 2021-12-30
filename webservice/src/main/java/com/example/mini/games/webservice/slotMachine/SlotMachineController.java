package com.example.mini.games.webservice.slotMachine;

import com.example.mini.games.business.slotMachine.service.SlotMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/slot-machine")
public class SlotMachineController {

    @Autowired
    public SlotMachineService service;

    @RequestMapping("/pokemon-type/{id}")
    public ResponseEntity<String> getPokemonType(@PathVariable("id") String id){
        return new ResponseEntity<String>(service.getPokemonTypes(id), HttpStatus.OK);
    }

    @RequestMapping("/")
    public ResponseEntity<String> get(){
        return new ResponseEntity<String>(HttpStatus.OK);
    }
}


