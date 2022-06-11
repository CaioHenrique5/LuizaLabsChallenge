package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CommunicationTest {

	@Test
	@DisplayName("Validando Gets e Sets do Communitacion")
	public void ValidandoSetAndGet() {
		Communication comm = new Communication();
		comm.setDestination("");
		comm.setId(1);
		comm.setMessage("Teste");
		comm.setType("");
		comm.setSendTime(null);
		assertEquals(comm.getDestination(),"");
		assertEquals(comm.getId(), 1);
		assertEquals(comm.getMessage(),"Teste");
		assertEquals(comm.getType(),"");
		assertEquals(comm.getSendTime(),null);
	}
	@Test
	@DisplayName("Validação do construtor com os campos setados")
	public void ValidandoConstrutor() {
		Communication comm = new Communication("","", null, "");
		assertNotNull(comm);
	}

}
