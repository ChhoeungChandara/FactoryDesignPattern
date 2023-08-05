package com.chandara.factory;

import com.chandara.factory.impl.Laptop;
import com.chandara.factory.impl.Pc;
import com.chandara.factory.impl.Server;

public class ComputerFactory {
	
	private ComputerFactory() {
		super();
	}
	
	public static Computer getComputer(ComputerType computerType, String ram,String hdd
			                            ,String cpu,boolean isGraphicsEnabled,boolean isBluetoothEnabled) {
		
		switch(computerType) {
		case PC :
			return new Pc(ram,hdd,cpu,isGraphicsEnabled,isBluetoothEnabled);
		case SERVER :
			return new Server( ram,  hdd,  cpu,  isGraphicsEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
		
		default : 
			throw new RuntimeException("Invalid Computer type");
		}
	}

}
