package com.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user_roles")
public class UserRole
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")	
	private int roleId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="role")
	private String userRole;

	public int getRoleId()
	{
		return roleId;
	}

	public void setRoleId(int roleId)
	{
		this.roleId = roleId;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getUserRole()
	{
		return userRole;
	}

	public void setUserRole(String userRole)
	{
		this.userRole = userRole;
	}

	@Override
	public String toString()
	{
		return "UserRole [roleId=" + roleId + ", username=" + username + ", userRole=" + userRole + "]";
	}	
	
}
