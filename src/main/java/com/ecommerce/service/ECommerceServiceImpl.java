package com.ecommerce.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ECommerceDAO;
import com.ecommerce.model.User;

@Service
public class ECommerceServiceImpl implements ECommerceService
{
	@Autowired
	private ECommerceDAO eCommerceDao;
	
	@Override
	@Transactional
	public void registerUser(User user)
	{
		eCommerceDao.registerUser(user);
	}
}
