package com.taohansen.infnet.apimath.entities;

import com.taohansen.infnet.apimath.dtos.NumsDTO;

import java.math.BigDecimal;

public class Nums {
    private BigDecimal num1;
    private BigDecimal num2;
    private BigDecimal response;
    public Nums() {
    }

    public Nums(BigDecimal num1, BigDecimal num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Nums(NumsDTO dto) {
        this.num1 = new BigDecimal(dto.getNum1());
        this.num2 = new BigDecimal(dto.getNum2());
    }

    public BigDecimal getNum1() {
        return num1;
    }

    public void setNum1(BigDecimal num1) {
        this.num1 = num1;
    }

    public BigDecimal getNum2() {
        return num2;
    }

    public void setNum2(BigDecimal num2) {
        this.num2 = num2;
    }

    public BigDecimal getResponse() {
        return response;
    }

    public void setResponse(BigDecimal response) {
        this.response = response;
    }
}
