package com.firstproject.app.services;

public interface UserDetails {

	String getUsername();

	boolean isAccountNonExpired();

	boolean isEnabled();

	boolean isCredentialsNonExpired();

	boolean isAccountNonLocked();

}
