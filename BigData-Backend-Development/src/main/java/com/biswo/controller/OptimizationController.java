package com.biswo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biswo.entity.OptimizationRequest;
import com.biswo.entity.OptimizationResult;
import com.biswo.service.OptimizationService;

@RestController
@RequestMapping("/optimize-move")
public class OptimizationController {
	@Autowired
    private OptimizationService optimizationService;

    @PostMapping("/request")
    public ResponseEntity<OptimizationResult> optimize(@RequestBody OptimizationRequest request) {
        return ResponseEntity.ok(optimizationService.optimize(request));
    }
}
