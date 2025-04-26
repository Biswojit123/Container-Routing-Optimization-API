package com.biswo.entity;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Constraints {
	private int maxMovesPerHour;
    private List<String> priorityRules;
    private Map<String, Integer> berthLimits;
}
