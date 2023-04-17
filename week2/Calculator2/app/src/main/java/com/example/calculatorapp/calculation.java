package com.example.calculatorapp;

public class calculation {
    private String math;
    private String result;

    public calculation(String math, String result) {
        this.math = math;
        this.result = result;
    }

    public String getMath() {
        return math;
    }

    public String getResult() {
        return result;
    }
}
