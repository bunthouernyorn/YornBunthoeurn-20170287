package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import common.exception.PlaceOrderException;

class ValidatePhoneTest {
	
	
	
	private PlaceOrderController placeOrderContrller;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@Test
	

	void test() {
		
		boolean isValid = placeOrderController.validatePhoneNumber("123456784");
		assertEquals(isValid,true);
	}

}
