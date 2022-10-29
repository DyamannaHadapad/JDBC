package com.xworkz.company.service;

import com.xworkz.company.DTO.CompanyInfoDTO;
import com.xworkz.company.repository.CompanyRepository;
import com.xworkz.company.repository.CompanyRepositoryImpl;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public boolean validateAndSave(CompanyInfoDTO dto) {
		int id = dto.getId();
		String name = dto.getName();
		String owner = dto.getOwner();
		String type = dto.getType();

		if (id > 1 && id < 100) {
			System.out.println("id is valid");
			if (name != null && name.length() > 2 && name.length() < 30) {
				System.out.println("name is valid");
				if (owner != null && owner.length() > 2 && owner.length() < 30) {
					System.out.println("owner is valid");
					if (type != null && type.length() > 2 && type.length() < 30) {
						System.out.println("type is valid");
						CompanyRepository companyRepository = new CompanyRepositoryImpl();
						companyRepository.save(dto);
					} else {
						System.err.println("type invalid");
					}
				} else {
					System.err.println("owner invalid");
				}
			} else {
				System.err.println("name invalid");
			}
		} else {
			System.err.println("id invalid");
		}
		return false;
	}

}
