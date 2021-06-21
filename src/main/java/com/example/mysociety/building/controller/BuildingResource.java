package com.example.mysociety.building.controller;

import com.example.mysociety.building.model.Building;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController("building-controller")
@RequestMapping("/api/buildings")
public class BuildingResource {
    private final Map<String, Building> buildingMap = new ConcurrentHashMap<>();

    @GetMapping
    @ResponseBody
    public Collection<Building> getBuildings() {
        return buildingMap.values();
    }
}
