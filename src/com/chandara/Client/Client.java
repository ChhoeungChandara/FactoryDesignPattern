package com.chandara.Client;

import com.chandara.factory.Computer;
import com.chandara.factory.ComputerFactory;
import com.chandara.factory.ComputerType;

public class Client {
	public static void main(String[] args) {
		Computer Pc = ComputerFactory.getComputer(ComputerType.PC, "32", "1T", "3.44 HGZ", true, true);
		System.out.println(Pc);
		Computer Laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "16", "500", "2.44 HGZ", true, false);
		System.out.println(Laptop);
		Computer Server = ComputerFactory.getComputer(ComputerType.PC, "120", "20T", "6.44 HGZ", true, false);
		System.out.println(Server);

	}

}
