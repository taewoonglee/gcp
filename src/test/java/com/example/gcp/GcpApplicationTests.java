package com.example.gcp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GcpApplicationTests {

	@Test
	void test() {
		Assertions.assertEquals(1+2,2);
	}

}
