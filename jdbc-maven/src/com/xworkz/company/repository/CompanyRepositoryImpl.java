package com.xworkz.company.repository;

import java.sql.*;
import com.xworkz.company.DTO.CompanyInfoDTO;

public class CompanyRepositoryImpl implements CompanyRepository {
	public CompanyRepositoryImpl() {
		System.out.println("defult constr of CompanyRepositoryImpl  :" + getClass().getSimpleName());
	}

	public String URL = "jdbc:mysql://localhost:3306/jdbc";
	public String USERNAME = "root";
	public String HIDE = "Xworkzodc@123";

	@Override
	public boolean save(CompanyInfoDTO dto) {
		System.out.println("Running Save method");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(URL, USERNAME, HIDE);
			String sql = "insert into company values(" + dto.getId() + ",'" + dto.getName() + "','" + dto.getOwner()
					+ "','" + dto.getType() + "')";
			Statement statement = connection.createStatement();
			System.out.println(statement);
			int execute = statement.executeUpdate(sql);
			if (execute > 0) {
				System.out.println("genarated data   :" + sql);
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return true;
	}

}
