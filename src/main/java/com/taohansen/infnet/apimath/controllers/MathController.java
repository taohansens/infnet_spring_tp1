package com.taohansen.infnet.apimath.controllers;

import com.taohansen.infnet.apimath.dtos.NumsDTO;
import com.taohansen.infnet.apimath.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathController {

    @Autowired
    MathService service;

    @GetMapping("/somar")
    public ResponseEntity<?> getadd(@RequestParam String num1, @RequestParam String num2) {
        return add(num1, num2);
    }

    @PostMapping("/somar")
    public ResponseEntity<?> postadd(@RequestBody NumsDTO dto) {
        return add(dto.getNum1(), dto.getNum2());
    }

    private ResponseEntity add(String num1, String num2) {
        try {
            NumsDTO numsDTO = new NumsDTO(num1, num2);
            numsDTO = service.sum(numsDTO);
            return ResponseEntity.ok(numsDTO);
        } catch (Exception e) {
                return ResponseEntity.badRequest().body("Invalid input");
            }
    }

    @GetMapping("/diminuir")
    public ResponseEntity<?> getsubtract(@RequestParam String num1, @RequestParam String num2) {
        return subtract(num1, num2);
    }

    @PostMapping("/diminuir")
    public ResponseEntity<?> postsubtract(@RequestBody NumsDTO dto) {
        return subtract(dto.getNum1(), dto.getNum2());
    }

    private ResponseEntity subtract(String num1, String num2) {
        try {
            NumsDTO numsDTO = new NumsDTO(String.valueOf(num1), String.valueOf(num2));
            numsDTO = service.subtract(numsDTO);
            return ResponseEntity.ok(numsDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input");
        }
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<?> getmultiply(@RequestParam String num1, @RequestParam String num2) {
        return multiply(num1, num2);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<?> postmultiply(@RequestBody NumsDTO dto) {
        return multiply(dto.getNum1(), dto.getNum2());
    }

    private ResponseEntity multiply(String num1, String num2) {
        try {
            NumsDTO numsDTO = new NumsDTO(String.valueOf(num1), String.valueOf(num2));
            numsDTO = service.multiply(numsDTO);
            return ResponseEntity.ok(numsDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input");
        }
    }

    @GetMapping("/dividir")
    public ResponseEntity<?> getdivide(@RequestParam String num1, @RequestParam String num2) {
        return divide(num1, num2);
    }

    @PostMapping("/dividir")
    public ResponseEntity<?> postdivide(@RequestBody NumsDTO dto) {
        return divide(dto.getNum1(), dto.getNum2());
    }

    private ResponseEntity divide(String num1, String num2) {
        try {
            NumsDTO numsDTO = new NumsDTO(String.valueOf(num1), String.valueOf(num2));
            numsDTO = service.divide(numsDTO);
            return ResponseEntity.ok(numsDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input");
        }
    }

    @GetMapping("/expo")
    public ResponseEntity<?> getexpo(@RequestParam String num1, @RequestParam String num2) {
        return expo(num1, num2);
    }

    @PostMapping("/expo")
    public ResponseEntity<?> postexpo(@RequestBody NumsDTO dto) {
        return expo(dto.getNum1(), dto.getNum2());
    }

    private ResponseEntity expo(String num1, String num2) {
        try {
            NumsDTO numsDTO = new NumsDTO(String.valueOf(num1), String.valueOf(num2));
            numsDTO = service.expo(numsDTO);
            return ResponseEntity.ok(numsDTO);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input");
        }
    }

}