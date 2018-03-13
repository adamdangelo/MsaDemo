package com.devtechnology.MsaDemoAlienDashboardService.domain.model;

public class AlienInfo {
    private Long alienId;
    private String alienNumber;
    private String name;
    private String country;

    public Long getAlienId() {
        return alienId;
    }

    public void setAlienId(Long alienId) {
        this.alienId = alienId;
    }

    public String getAlienNumber() {
        return alienNumber;
    }

    public void setAlienNumber(String alienNumber) {
        this.alienNumber = alienNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Alien [alienId=" + alienId + ", alienNumber=" + alienNumber + ", name=" + name + ", country=" + country + "]";
    }
}
