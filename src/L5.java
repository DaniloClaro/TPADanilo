import java.util.*;
public class L5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int a[] = new int [10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			a[i] = input.nextInt();
			
			for(int i2 = 1; i2 <= a[i]; i2++) {
				if(a[i] % i2 == 0) {
					System.out.print(a[i]+" = "+i2+"\n");
				}
			}
		}
		System.out.println("END");
	}

}
