package com.saimun.restconceptapplication;

public record OrderRecord(
		String customerName,
		String productName,
		Integer quantity
) {
}
