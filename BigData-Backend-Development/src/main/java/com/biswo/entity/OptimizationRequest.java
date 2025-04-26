package com.biswo.entity;

import java.util.List;

import lombok.Data;

@Data
public class OptimizationRequest {
	private List<Container> containers;
	private Constraints constraints;
}
