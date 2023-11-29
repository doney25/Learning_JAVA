package hello;

//import java.util.Scanner;

public class ThreadsDemo {
	 public static void main(String args []) {
		 oddThreads obj1 = new oddThreads();
		 evenThreads obj2 = new evenThreads();
		 obj1.start();
		 obj2.start();
		 
	 }
}
class oddThreads extends Thread{
	public void run() {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("enter odd limit:");
		//int lim = sc.nextInt();
		for(int i=1;i<10;i=i+2) {
		  System.out.println("odd numbers:"+i+" ");
		}
	}
}
class evenThreads extends Thread{
	public void run() {
		//Scanner sc = new Scanner(System.in);
		//System.out.print("enter even limit:");
		//int lim = sc.nextInt();
		for(int i=0;i<10;i=i+2) {
		  System.out.println("even numbers:"+i+" ");
		
	}
}
}