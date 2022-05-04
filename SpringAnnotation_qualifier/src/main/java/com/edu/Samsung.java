package com.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
  @Autowired
  @Qualifier("snapDragon")
  MobileProcessor mobile;

public MobileProcessor getMobile() {
	return mobile;
}

public void setMobile(MobileProcessor mobile) {
	this.mobile = mobile;
}
public void MobileConfig() {
	System.out.println("ABOUT PHONE- 128GB,64PX CAMERA , DAULSIM");
	mobile.display();
}

}
