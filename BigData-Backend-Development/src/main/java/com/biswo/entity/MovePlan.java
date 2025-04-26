package com.biswo.entity;

import java.time.Instant;

import lombok.Data;

@Data
public class MovePlan {
	private String containerId;
	private Instant moveTime;
	private String assignedBerth;
}
