package com.ecommerce.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;
import com.ecommerce.model.UserRole;

@Repository
public class ECommerceDAOImpl implements ECommerceDAO
{
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private UserRole userRole;
	
	@Override
	public void registerUser(User user)
	{
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setEnabled(1);
		entityManager.persist(user);
		userRole.setUsername(user.getUsername());
		userRole.setUserRole("ROLE_USER");
		entityManager.persist(userRole);
	}
}
