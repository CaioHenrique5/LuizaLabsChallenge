package com.example.demo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMMUNICATION")
public class Communication {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private Date sendTime;
	@Column(nullable = false)
	private String destination;
	@Column(nullable = false)
	private String message;
	
	public Communication(String type,String destination, Date sendTime, String message){
		this.type = type;
		this.sendTime = sendTime;
		this.destination = destination;
		this.message = message;
	}
	public Communication() {
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
