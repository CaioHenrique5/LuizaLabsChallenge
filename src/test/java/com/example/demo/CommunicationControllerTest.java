package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;


import io.restassured.http.ContentType;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

class CommunicationControllerTest {

	private CommunicationController commControl;
	
	@MockBean
	private CommunicationService commService;
	
	@BeforeEach
	public void setup() {
	}
	
	@Test
	void validarListAll() {
	}

}
