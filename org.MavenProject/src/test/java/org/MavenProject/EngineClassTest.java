package org.MavenProject;

import org.testng.annotations.Test;

public class EngineClassTest {
	@Test
  public void clutchTest() {
	  System.out.println("Engin Clutch Test get Executed 1 !");
  }
	@Test
	public void gearTest() {
		System.out.println("Engines Gears Test getExecuted 2 !");
	}
	@Test
	 public void combustionTest() {
		 System.out.println("Engine Combustion Test get Executed 3 !");
	 }
	@Test
	public void exahustTest() {
		System.out.println("Engine Exhaust Test get Executed 4A");
		System.out.println("Engine Exhaust Test get Executed 4 !");
	}
	@Test
	public void petrolTankTest() {
		System.out.println("Engine Petrol Tank Test get Executed ");
	}
}
