package com.example.ss7apiweatherrecyclerview.model;

public class Temperature {
    private Double Value;
    private String unit;

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
