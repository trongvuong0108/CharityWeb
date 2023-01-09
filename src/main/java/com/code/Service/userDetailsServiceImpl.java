package com.code.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.code.Entity.User;
import com.code.Repository.userRepository;


@Service("userDetailsService")
public class userDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private userRepository userRepository ; 
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username);
		if(user == null ) throw new UsernameNotFoundException("User not find");
		Set<GrantedAuthority> auth = new HashSet<>();	
		auth.add(new SimpleGrantedAuthority(user.getUserRole().getName()));
		return new org.springframework.security.core.userdetails
				   .User(user.getEmail(),user.getMatkhau(),true,true,true,true,auth);
	}
}
