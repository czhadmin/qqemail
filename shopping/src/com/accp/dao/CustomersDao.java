package com.accp.dao;

import com.accp.entity.Customers;

public interface CustomersDao {
	//按名称和密码查询
		Customers query(String customerName,String customerPassword);
	//按名称查询是否重复	
		Customers query(String customerName);
	//新增用户
		int insert(Customers cus);
}
