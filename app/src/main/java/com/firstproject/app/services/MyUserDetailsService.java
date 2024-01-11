package com.firstproject.app.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.app.modules.UserPrincipal;
import com.firstproject.app.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository  userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws Exception {

		User user = (User) userRepository.findByUsername(username);
		if(user==null) {
			throw new Exception("User not found!");
		}
 
		return (UserDetails) new UserPrincipal((com.firstproject.app.modules.User) user);
	}

}
