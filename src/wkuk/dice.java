package wkuk;
import java.util.Random;

public class dice {
	
	public int rolldedie (int number) {
		int total = 0;
		for(int i = 0; i < number; i++) {
			Random rand = new Random(); 
			int  n = rand.nextInt(6) + 1;
			total += n;
		}	
		return total;
	}
	public void rolldedice(int number, int value, int ticker) {
		int attempt = rolldedie(number);
		if(attempt != value) {
			System.out.println("Failed Attempt #" + ticker + ": return value was " + attempt);
			ticker += 1;
			rolldedice(number, value, ticker);
		}
		if(attempt == value) {
			System.out.println("It took " + ticker + " roll-throughs to get exactly " + value);
		}
	}
	public static void main(String[] args) {
		int number = 1000;
		dice googa = new dice();
		System.out.println( googa.rolldedie(number));
		googa.rolldedice(1000, 3500, 0);
	}
	
}
