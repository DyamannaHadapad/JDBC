package com.xworkz.personRunner.service;

import com.xworkz.personRunnerDTO.PersonDTO;

public class PersonServiceImpl implements PersonService {

	public PersonServiceImpl() {
		System.out.println("Defult constr of PersonServiceImpl   : " + getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(PersonDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String email = dto.getEmail();
		long number = dto.getMobileNumber();
		char gender = dto.getGender();
		String qualification = dto.getQualification();
		boolean married = dto.isMarried();
		boolean working = dto.isWorking();
		String companyName = dto.getCompanyName();
		double salary = dto.getSalary();
		int age = dto.getAge();
		double exp = dto.getExperience();
		String location = dto.getLocation();
		String city = dto.getCity();
		String state = dto.getState();
		String country = dto.getCountry();
		long aadharNumber = dto.getAadharNumber();
		String pannumber = dto.getPanNumber();
		boolean alive = dto.isAlive();
		long bankAccountNumber = dto.getBankAccountNumber();

		if (id < 1 && id > 100) {
			System.out.println("id is valid");
			if (name != null && name.length() < 2 && name.length() > 50) {
				System.out.println("name is valid");
				if (email != null && email.length() < 2 && email.length() > 50) {
					System.out.println("email is valid");
					if (number < 1 && number > 100) {
						System.out.println("number is valid");
					} else {
						System.out.println("number invalid");
					}
				} else {
					System.out.println("email invalid");
				}
			} else {
				System.out.println("name invalid");
			}
		} else {
			System.out.println("id invalid");
		}

		return false;
	}

}
