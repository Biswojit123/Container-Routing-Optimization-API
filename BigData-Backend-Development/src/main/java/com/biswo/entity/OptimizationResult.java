package com.biswo.entity;

import java.time.Instant;
import java.util.List;

import lombok.Data;

@Data
public class OptimizationResult {
	private List<MovePlan> optimalPlan;
    private int totalMoves;
    private Instant estimatedCompletionTime;
}
