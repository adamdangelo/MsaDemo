package com.devtechnology.MsaDemoAlienSearchService.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Service;

import com.devtechnology.MsaDemoAlienSearchService.domain.model.Alien;

@Service
public class AlienSearchService {
    private static Map <Long, Alien> AlienRepsitory = null;
    static {
        Stream <String> alienStream = Stream.of("1,A12345678,Gomez Juan,Mexico", "2,A23345986,Emir McTaliban,Qatar");
        AlienRepsitory = alienStream.map(alienStr -> {
            String[] info = alienStr.split(",");
            return createAlien(new Long(info[0]), info[1], info[2], info[3]);
        }).collect(Collectors.toMap(Alien::getAlienId, emp -> emp));
    }
    private static Alien createAlien(Long id, String alienNumber, String name, String country) {
        Alien alien = new Alien();
        alien.setAlienId(id);
        alien.setAlienNumber(alienNumber);
        alien.setName(name);
        alien.setCountry(country);
        return alien;
    }
    public Alien findById(Long id) {
        return AlienRepsitory.get(id);
    }
    public Collection <Alien> findAll() {
        return AlienRepsitory.values();
    }
}