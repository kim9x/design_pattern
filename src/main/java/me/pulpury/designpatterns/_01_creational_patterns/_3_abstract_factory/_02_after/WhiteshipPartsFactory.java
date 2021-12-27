package me.pulpury.designpatterns._01_creational_patterns._3_abstract_factory._02_after;

import me.pulpury.designpatterns._01_creational_patterns._3_abstract_factory._01_before.WhiteAnchor;
import me.pulpury.designpatterns._01_creational_patterns._3_abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}
	
}
