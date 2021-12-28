package me.pulpury.designpatterns._02_structural_patterns._06_adapter._01_befroe.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
