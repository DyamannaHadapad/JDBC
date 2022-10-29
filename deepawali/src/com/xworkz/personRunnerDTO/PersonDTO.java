package com.xworkz.personRunnerDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

@Data
@AllArgsConstructor

public class PersonDTO {

	private int id;
	private String name;
	private String email;
	private long mobileNumber;
	private char gender;
	private String qualification;
	private boolean married;
	private boolean working;
	private String companyName;
	private double salary;
	private int age;
	private double experience;
	private String location;
	private String city;
	private String state;
	private String country;
	private long aadharNumber;
	private String panNumber;
	private boolean alive;
	private long bankAccountNumber;

}
