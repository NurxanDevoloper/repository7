package SRP;

public class Main {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Adder adder = new Adder();
		
        adder.add(100, 100);
		System.out.println("Сумма чисел: " + adder);
	}
}
