package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Up to what number do you want the computer to find prime numbers until?");
		int n = scan.nextInt();
		
		boolean prime[] = new boolean [n+1];
		for (int i=0; i<=n; i++) {
			prime[i] = true;
		}
		for (int j=2; j*j<=n; j++) {
			if (prime[j] == true) {
				for (int i = j*j; i<=n; i+=j) {
					prime[i] = false;
				}
			}
		}
		for (int i=2; i<=n; i++) {
			if (prime[i] ==  true) {
				System.out.print(i + " ");
			}
		}
		System.out.println("are the prime numbers that are less than or equal to " + n +".");
	}
}
