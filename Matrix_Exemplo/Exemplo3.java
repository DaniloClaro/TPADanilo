import java.util.Scanner;
public class Exemplo3 {
	public static void main (String[]args) {
		Scanner ET = new Scanner (System.in);
		int v[][] = new int [3][3];
		int i,j;
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.println("\nEntre valor ["+(i+1)+"] ["+(j+1)+"] :: ");
				v[i][j] = ET.nextInt();
			}
		}
		System.out.println("\n :: Valores da Matriz :: \n");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.println(" [ "+v[i][j]+" ]");
				if(j==2) {
					System.out.println("\n");
			}
		}
	}

}
}