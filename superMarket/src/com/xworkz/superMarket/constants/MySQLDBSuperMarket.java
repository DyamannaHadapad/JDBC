package com.xworkz.superMarket.constants;

import lombok.Getter;

@Getter
public enum MySQLDBSuperMarket {

	URL("jdbc:mysql://localhost:3306/jdbc"), USERNAME("root"), HIDE("Xworkzodc@123");

	private String values;

	private MySQLDBSuperMarket(String values) {
		this.values = values;
	}

}
