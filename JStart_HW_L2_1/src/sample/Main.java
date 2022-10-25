package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		
		int x;	
		System.out.println("Введите 5-значное число:");
		x = sc.nextInt();
		
		int part1 = x / 10000;
		int part2 = x % 10000 /1000;
		int part3 = x % 1000 / 100;
		int part4 = x % 100 / 10;
		int part5 = x % 10;
		
		System.out.println(part1);
		System.out.println(part2);
		System.out.println(part3);
		System.out.println(part4);
		System.out.println(part5);
		

	}

}
