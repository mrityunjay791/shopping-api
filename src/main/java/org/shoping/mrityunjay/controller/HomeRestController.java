package org.shoping.mrityunjay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/myshoping")
public class HomeRestController {

	@RequestMapping(value="/get-product-name", method=RequestMethod.GET)
	public String getProductName() {
		return new String("hello Online shoping project ..");
	}
}
