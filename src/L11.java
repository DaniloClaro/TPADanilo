import java.util.*;
public class L11 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int a[] = new int [10];
		int i3 = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite "+(i+1)+"� n�mero inteiro");
			a[i] = input.nextInt();
		}
		
		System.out.println("Digite sua busca");
		int num = input.nextInt();
		
		for(int i2 = 0; i2 < 10; i2++) {
			if(num == a[i2]) {
				System.out.println(num+" est� em A");
				i2 = 11;
				i3 = 1;
			}
			
		}
		if(i3 != 1) {
			System.out.println("N�o foi encontrado");
		}
	}

}
