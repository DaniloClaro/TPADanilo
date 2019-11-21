import java.util.*;
public class L4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o valor "+(i+1)+"º valor");
			a[i] = input.nextInt();
			
			for(int i2 = 0; i2 <= a[i]; i2++) {
				if(i2 % 2 == 0) {
					System.out.println(a[i]+" = "+i2 );
				}
			}
		}
		System.out.println("END");
	}
}
