package com.biswo.service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.biswo.entity.Container;
import com.biswo.entity.MovePlan;
import com.biswo.entity.OptimizationRequest;
import com.biswo.entity.OptimizationResult;

@Service
public class OptimizationService {
	public OptimizationResult optimize(OptimizationRequest request) {
        List<MovePlan> plans = new ArrayList<>();
        int berthCounter = 1;

        for (Container container : request.getContainers()) {
            MovePlan plan = new MovePlan();
            plan.setContainerId(container.getId());
            plan.setMoveTime(Instant.now().plusSeconds(berthCounter * 300));
            plan.setAssignedBerth("B" + berthCounter);
            plans.add(plan);
            berthCounter++;
        }

        OptimizationResult result = new OptimizationResult();
        result.setOptimalPlan(plans);
        result.setTotalMoves(plans.size());
        result.setEstimatedCompletionTime(Instant.now().plusSeconds(plans.size() * 300));

        return result;
    }
}
