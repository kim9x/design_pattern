package me.pulpury.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;


// enum을 이용해서 singleton 만들기
public enum Settings {
	
	INSTANCE;
	
	private Settings() {
	}

	private Integer number;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
