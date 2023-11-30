package javaprojects;
import java.util.Random;
	class NumberManager{
	 private int generatedNumber;
	 private boolean numberCheck=false;
	 public synchronized void generateNumber() {
		 generatedNumber = new Random().nextInt(99)+2;
		 System.out.println("Generated Random Number: "+generatedNumber);
		 numberCheck = true;
		 notifyAll();
	 }
	 public synchronized void printOdd() throws InterruptedException{
		 while(!numberCheck || generatedNumber%2!=0) {
			 wait();
		 }
		 for(int i=1;i<generatedNumber;i=i+2) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 numberCheck=false;
	 }
	 public synchronized void printEven() throws InterruptedException{
		 while(!numberCheck || generatedNumber%2==0) {
			 wait();
		 }
		 for(int i=2;i<generatedNumber;i=i+2) {
			 System.out.print(i+" ");
		 }
		 System.out.println();
		 numberCheck=false;
	 }
}
	class NumberGenerator extends Thread{
		NumberManager num;
		public NumberGenerator(NumberManager num) {
			this.num=num;
		}
		public void run() {
			while(true) {
			num.generateNumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
	}
	class EvenPrinterThread extends Thread{
		NumberManager number;
		public EvenPrinterThread(NumberManager number) {
			this.number=number;
		}
		public void run() {
			while(true) {
				try {
					number.printEven();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	class OddPrinterThread extends Thread{
		NumberManager number;
		public OddPrinterThread(NumberManager number) {
			this.number=number;
		}
		public void run() {
			while(true) {
				try {
					number.printOdd();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
public class MultiThreadOddEven {
	public static void main(String[] args) {
		NumberManager manager = new NumberManager();
		NumberGenerator generator = new NumberGenerator(manager);
		EvenPrinterThread even = new EvenPrinterThread(manager);
		OddPrinterThread odd = new OddPrinterThread(manager);
		generator.start();
		even.start();
		odd.start();
	}
}
