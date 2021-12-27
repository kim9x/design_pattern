package me.pulpury.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import org.springframework.beans.factory.FactoryBean;

import me.pulpury.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import me.pulpury.designpatterns._01_creational_patterns._02_factory_method._02_after.Whiteship;

public class ShipFactory implements FactoryBean<Ship> {

    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
