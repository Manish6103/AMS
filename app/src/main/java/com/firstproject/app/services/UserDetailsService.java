package com.firstproject.app.services;

import java.io.FileNotFoundException;

//import com.firstproject.app.modules.UserPrincipal;

public interface UserDetailsService {

	UserDetails loadUserByUsername(String username) throws ClassNotFoundException, ClassNotFoundException, FileNotFoundException, Exception;

}
