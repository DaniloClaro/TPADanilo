import java.util.*;
public class A1 {
	public static void main(String[] args) {
		soma();
		
		
			
		}
		public static void soma() {
			Scanner input = new Scanner(System.in);
			
			int r = 0, a;
			
			System.out.println("Informe o valor");
			a = input.nextInt();
			
			for(int i = 0; i < 4; i++) {
				r += a * a;
			}
			System.out.println("O resultado é "+r);
		}
		
}

	