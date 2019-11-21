import java.util.*;
public class D4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a[][] = new int [5][5]; int tet = 0, r = 0;
		
		for(int j = 0; j < 5; j++) {
			for(int i = 0; i < 5; i++) {
				System.out.println("Digite o valor");
				a[i][j] = input.nextInt();
			}
		}
		for(int j2 = 0; j2 < 3; j2++) {
			System.out.println(a[j2][j2]);
		}
		r = 1;
		for(int j3 = 3; j3 < 5; j3++) {
			System.out.println(a[r][j3]);
			r = r - 1;
		}
	}
}
