package com.devtechnology.MsaDemoAlienDashboardService.controller;


import java.util.Collection;

import com.devtechnology.MsaDemoAlienDashboardService.domain.model.AlienInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class FeignAlienInfoController {
    @Autowired
    AlienServiceProxy alienServiceProxy;

    @RequestMapping("/dashboard/feign/{myself}")
    public AlienInfo findme(@PathVariable Long myself) {
        return alienServiceProxy.findById(myself);
    }
    @RequestMapping("/dashboard/feign/peers")
    public Collection <AlienInfo> findPeers() {
        return alienServiceProxy.findAll();
    }
}
