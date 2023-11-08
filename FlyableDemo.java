package javalab;

public class FlyableDemo {
	public static void main(String args [] ) {
	  Spacecraft s = new Spacecraft();
	  Airplane a = new  Airplane();
	  Helicopter h = new Helicopter();
	  s.Flyobj();
	  a.Flyobj();
	  h.Flyobj();
	}
}
interface Flyable{
	public void Flyobj();
}
class Spacecraft implements Flyable{
	public void Flyobj() {
		System.out.println("The Spacecraft is flying.");
	}
}
class Airplane implements Flyable{
	public void Flyobj() {
		System.out.println("The Airplane is flying.");
	}
}
class Helicopter implements Flyable{
	public void Flyobj() {
		System.out.println("The Helicopter is flying.");
		
	}
}