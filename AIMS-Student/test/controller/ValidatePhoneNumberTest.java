package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidatePhoneNumberTest {
	
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOderController();
	}

	@ParameterizedTest
	@CsvSource({
		
		
		"012345678, true",
		"01234, false",
		"abc123, false",
		"1234567890, false"
	})
	void test(String phone, boolean expected) {
		
				boolean isValid = placeOrderController.validatePhoneNumber(phone);
				assertEquals(expected, isValid);
	}

}
