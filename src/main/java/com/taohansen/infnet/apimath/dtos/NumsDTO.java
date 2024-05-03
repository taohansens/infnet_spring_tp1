package com.taohansen.infnet.apimath.dtos;

import com.taohansen.infnet.apimath.entities.Nums;

public class NumsDTO {
    private String num1;
    private String num2;
    private String response;

    public NumsDTO() {
    }

    public NumsDTO(String num1, String num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public NumsDTO(Nums entity) {
        this.num1 = entity.getNum1().toString();
        this.num2 = entity.getNum2().toString();
        this.response = entity.getResponse().toString();
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
