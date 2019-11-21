import java.util.*;
public class L3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a [] = new int [10];
		int total = 0, r;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			a[i] = input.nextInt();	
			
			for(int i3 = 1; i3 <= a[i]; i3++) {
				if(a[i] % i3 == 0) {
					total++;
					
				}
			}
			if(total == 2) {
				System.out.println("É primo");
			}
			else {
				System.out.println("Não é primo");
			}
			total = 0;
		}
		System.out.println("END");
		
	}
}