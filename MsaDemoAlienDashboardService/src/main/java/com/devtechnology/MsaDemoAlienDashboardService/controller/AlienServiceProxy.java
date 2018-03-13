package com.devtechnology.MsaDemoAlienDashboardService.controller;

import com.devtechnology.MsaDemoAlienDashboardService.domain.model.AlienInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;


@FeignClient(name = "AlienSearch")
@RibbonClient(name = "AlienSearch")
public interface AlienServiceProxy {

    @RequestMapping("/alien/find/{id}")
    public AlienInfo findById(@PathVariable(value = "id") Long id);

    @RequestMapping("/alien/findall")
    public Collection<AlienInfo> findAll();
}


