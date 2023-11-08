package javalab;

public class AnimalDemo {
	public static void main(String args [] ) {
		Lion l = new Lion();
		Tiger t = new Tiger();
		l.sound();
		t.sound();	
	}
}
abstract class Animal{
	 abstract public void sound(); 
}
class Lion extends Animal{
	@Override
	public void sound() {
		System.out.println("Lion roars.");
	}
}
class Tiger extends Animal{
	@Override
	public void sound() {
		System.out.println("Tiger growls.");
	}
}