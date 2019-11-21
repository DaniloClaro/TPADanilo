import java.util.*;
public class B2 {
	public static void main(String[] args) {
		tabuada();
	}
		public static void tabuada() {
			Scanner input = new Scanner(System.in);
			
			int a;
			
			System.out.println("Informe o número");
			a = input.nextInt();
			
			for(int i = 1; i <= 10; i++) {
				int r = a * i;
				System.out.println(a+ " X "+i+" = "+r);
			}
			
		}
}
