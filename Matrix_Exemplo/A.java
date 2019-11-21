import java.util.*;
public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int [4][4];
		int b = 2;
		
		for(int j = 0; j < 4; j++) {
			for(int i = 0; i < 4; i++) {
				a[i][j] = b + b;
				b = a[i][j];
				System.out.print(a[i][j]+" ");
				
				if(i == 3) {
					System.out.println("\n");
				}
			}
		}
	}

}
