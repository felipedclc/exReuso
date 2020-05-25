package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PrintService;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService <Integer> ps = new PrintService<>();
		
		System.out.println("How many values? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
