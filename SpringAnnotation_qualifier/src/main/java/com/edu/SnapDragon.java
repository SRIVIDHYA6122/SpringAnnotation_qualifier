package com.edu;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {
	public void display() {
		System.out.println("BEST MOBILE");
	}
}
