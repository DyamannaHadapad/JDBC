package com.xworkz.company.runner;

import com.xworkz.company.DTO.CompanyInfoDTO;
import com.xworkz.company.service.CompanyService;
import com.xworkz.company.service.CompanyServiceImpl;

public class CompanyRunner {
	public static void main(String[] args) {

		CompanyInfoDTO dto = new CompanyInfoDTO(3, "TCS", "TATA GROUP", "Info Tech");
		CompanyInfoDTO dto1 = new CompanyInfoDTO(2, "Infosyis", "Narayan Murthy", "Info Tech");

		CompanyService companyService = new CompanyServiceImpl();
		companyService.validateAndSave(dto);
		companyService.validateAndSave(dto1);

	}

}
