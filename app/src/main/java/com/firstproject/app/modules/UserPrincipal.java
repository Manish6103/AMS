package com.firstproject.app.modules;

import java.util.Collections;
import java.util.Set;

import com.firstproject.app.services.UserDetails;

public class UserPrincipal implements UserDetails {
	
	private User user;

	public UserPrincipal(User user) {
		this.user = user;
	}

	public <GrantedAuthority> Set<Object> getAuthorities() {
		return Collections.singleton(new Object());
	}

	public String getPassword() {
		return ( user).getPassword();
	}

	@Override
	public String getUsername() {
		return ((UserDetails) user).getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
