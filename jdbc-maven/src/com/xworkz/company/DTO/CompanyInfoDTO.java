package com.xworkz.company.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyInfoDTO {
	private int id;
	private String name;
	private String owner;
	private String type;

}
