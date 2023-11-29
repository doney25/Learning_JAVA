package sample;

class MultiplicationTable{
	synchronized void print(int num) {
			for( int i=1;i<=10;i++)
			{
				System.out.println(i+"x"+num+"="+i*num);
			}
		}	
	}
class myThreads extends Thread{
	MultiplicationTable t;
	myThreads(MultiplicationTable t) {
	this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.print(5);
	}
}
class myThread2 extends Thread{
	MultiplicationTable t;
	myThread2(MultiplicationTable t){
		this.t=t;
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
		t.print(7);
	}
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		MultiplicationTable mult = new MultiplicationTable();
		myThreads t = new myThreads(mult);
		myThread2 t2 = new myThread2(mult);
		t2.setPriority(3);
		t2.start();
		t.start();
		
		
	}
}
