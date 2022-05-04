package com.edu;

import org.springframework.stereotype.Component;

@Component
public class MediaTak implements MobileProcessor {
	public void display() {
		System.out.println("WORLD BEST MOBILE");
	}

}
