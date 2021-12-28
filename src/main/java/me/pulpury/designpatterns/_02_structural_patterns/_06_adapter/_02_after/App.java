package me.pulpury.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.pulpury.designpatterns._02_structural_patterns._06_adapter._02_after.security.LoginHandler;

public class App {
	
	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		AccountUserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		String login = loginHandler.login("taeju", "taeju");
		System.out.println(login);
	}

}
