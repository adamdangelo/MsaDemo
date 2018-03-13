package com.devtechnology.MsaDemoAlienSearchService.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devtechnology.MsaDemoAlienSearchService.domain.model.Alien;
import com.devtechnology.MsaDemoAlienSearchService.service.AlienSearchService;

@RefreshScope
@RestController
public class AlienSearchController {
    @Autowired
    AlienSearchService alienSearchService;

    @RequestMapping("/alien/find/{id}")
    public Alien findById(@PathVariable Long id) {
        return alienSearchService.findById(id);
    }

    @RequestMapping("/alien/findall")
    public Collection <Alien> findAll() {
        return alienSearchService.findAll();
    }
}
