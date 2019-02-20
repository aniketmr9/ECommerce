package com.ecommerce;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception
	{
		authenticationManagerBuilder.jdbcAuthentication().dataSource(dataSource)
			.passwordEncoder(new BCryptPasswordEncoder())
			.usersByUsernameQuery("select username,password,enabled from users where username = ?")
			.authoritiesByUsernameQuery("select username,role from user_roles where username = ?");
		
		
		
		
		
		
		
		/*authenticationManagerBuilder.inMemoryAuthentication()
			.withUser("devUser").password("{noop}dev").authorities("ROLE_USER")
			.and()
			.withUser("admin").password("{noop}admin").authorities("ROLE_USER","ROLE_ADMIN");*/
	}
	
	//Authorization
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception
	{

		httpSecurity
			.authorizeRequests()
			.antMatchers("/register","/registerUser","/loginForm").permitAll()
			.and()
			.authorizeRequests()
			.antMatchers("/admin/*").hasRole("ADMIN")
			.and()			
			.authorizeRequests()
			.antMatchers("/user/*").hasAnyRole("USER","ADMIN")
			.anyRequest().authenticated().and().formLogin().loginPage("/loginForm")
			.usernameParameter("username").passwordParameter("password");
			
	}
}