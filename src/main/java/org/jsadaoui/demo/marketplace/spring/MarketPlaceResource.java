package org.jsadaoui.demo.marketplace.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/marketplace")
//@Spring
public class MarketPlaceResource {
	
	public MarketPlaceResource() {
		int i = 1;
	}

	@Autowired
//	@Platform(Platform.OperatingSystems.IOS)
	private AppleMarketPlace ios;
	
	@Autowired
//	@Platform(Platform.OperatingSystems.ANDROID)
	private GoogleMarketPlace android;
	
	@RequestMapping("/ios")
	public String ios() {
		return "ios:" + ios;
	}
	
	@RequestMapping("/android")
	public String android() {
		return "android:" + android;
	}
}
