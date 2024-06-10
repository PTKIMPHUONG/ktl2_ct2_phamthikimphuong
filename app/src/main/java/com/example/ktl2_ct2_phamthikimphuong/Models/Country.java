package com.example.ktl2_ct2_phamthikimphuong.Models;

import java.io.Serializable;

public class Country implements Serializable {
    private String imgUrl;
    private String commonName;
    private String officialName;
    private String capital;
    private String language;
    private int population;
    private String continent;
    public Country() {
        this.imgUrl = "";
        this.commonName = "";
        this.officialName = "";
        this.capital = "";
        this.language = "";
        this.population = 0;
        this.continent = "";
    }
    public Country(String imgUrl, String commonName, String officialName, String capital, String language, int population, String continent) {
        this.imgUrl = imgUrl;
        this.commonName = commonName;
        this.officialName = officialName;
        this.capital = capital;
        this.language = language;
        this.population = population;
        this.continent = continent;
    }

    // Getters and Setters
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
