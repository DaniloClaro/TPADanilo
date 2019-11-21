import java.util.*;
public class C3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int [5][5];int i9 = 0,h2 = 0;
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.println("Digite o valor");
				a[i][j] = input.nextInt();
			}
		}
		
		for(int j2 = 0; j2 < 5; j2++) {
			System.out.println(a[j2][j2]);
			
		}
		
	}

}
