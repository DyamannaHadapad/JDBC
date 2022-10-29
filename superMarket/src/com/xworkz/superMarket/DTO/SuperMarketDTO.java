package com.xworkz.superMarket.DTO;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
public class SuperMarketDTO implements Serializable {
	public SuperMarketDTO() {
		
	}
	private int id;
	private String name;
	private String company;
	private String gstNo;
	private int pincode;
	private String type;

}
