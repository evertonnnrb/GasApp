package com.example.gasapp.model;

public class Fuel {

    private Long id;
    private String typeFuel;
    private Double valueFuel;

    private String recomendation;

    public Fuel(){}

    public Fuel(String typeFuel, Double valueFuel, String recomendation) {
        this.typeFuel = typeFuel;
        this.valueFuel = valueFuel;
        this.recomendation = recomendation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    public Double getValueFuel() {
        return valueFuel;
    }

    public void setValueFuel(Double valueFuel) {
        this.valueFuel = valueFuel;
    }

    public String getRecomendation() {
        return recomendation;
    }

    public void setRecomendation(String recomendation) {
        this.recomendation = recomendation;
    }
}
