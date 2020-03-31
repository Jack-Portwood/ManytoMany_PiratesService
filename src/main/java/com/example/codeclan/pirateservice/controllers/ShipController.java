package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.Models.Ship;
import com.example.codeclan.pirateservice.Repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }
}
