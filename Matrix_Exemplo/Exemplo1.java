import java.util.*;
public class Exemplo1 {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		
		int matriz [][] = new int [3][3];
		
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				matriz[linha][coluna] = (int) (Math.random()*10);
				
				
				
			}
		}
	}
}