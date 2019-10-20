package com.example.bmi_calculator;

public class Bmimodel {
    private Float weight, height;

    public Bmimodel(Float weight, Float height) {
        this.weight = weight;
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}