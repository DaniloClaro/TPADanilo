import java.util.Scanner;
public class L2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[] = new int [10]; 
		int va;
		
		for(int i3 = 1; i3 <= 5; i3++) {
			System.out.println("Digite o valor "+i3+" valor");
			va = input.nextInt();
		
				for(int i = 0; i < 10; i++) {
			
			
			
					a[i] = va * (i+1);
			
				}
			for(int i2 = 0; i2 < 10; i2++) {
			System.out.println("\n"+a[i2]);
			}
		}
		System.out.println("ACABOU");
	}
}