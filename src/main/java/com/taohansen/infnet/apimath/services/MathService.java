package com.taohansen.infnet.apimath.services;

import com.taohansen.infnet.apimath.dtos.NumsDTO;
import com.taohansen.infnet.apimath.entities.Nums;
import org.springframework.stereotype.Service;

import java.math.RoundingMode;

@Service
public class MathService {
    public NumsDTO sum(NumsDTO numsDTO) {
        Nums entity = new Nums(numsDTO);
        entity.setResponse(entity.getNum1().add(entity.getNum2()));
        return new NumsDTO(entity);
    }

    public NumsDTO subtract(NumsDTO numsDTO) {
        Nums entity = new Nums(numsDTO);
        entity.setResponse(entity.getNum1().subtract(entity.getNum2()));
        return new NumsDTO(entity);
    }

    public NumsDTO multiply(NumsDTO numsDTO) {
        Nums entity = new Nums(numsDTO);
        entity.setResponse(entity.getNum1().multiply(entity.getNum2()));
        return new NumsDTO(entity);
    }

    public NumsDTO divide(NumsDTO numsDTO) {
        Nums entity = new Nums(numsDTO);
        entity.setResponse(entity.getNum1().divide(entity.getNum2(), 25, RoundingMode.HALF_UP));
        return new NumsDTO(entity);
    }

    public NumsDTO expo(NumsDTO numsDTO) {
        Nums entity = new Nums(numsDTO);
        entity.setResponse(entity.getNum1().pow(entity.getNum2().intValue()));
        return new NumsDTO(entity);
    }
}
