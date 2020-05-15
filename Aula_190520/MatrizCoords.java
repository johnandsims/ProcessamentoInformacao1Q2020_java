import java.util.Scanner;

public class MatrizCoords{
	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);
		
		System.out.println("Número de filas da matriz?");
		int row = read.nextInt(); 
		System.out.println("Número de colunas da matriz?");
		int col = read.nextInt();
		
		// Crie matriz de coordinados em x (filas)
		int [][] M = new  int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				M[i][j] = i;
			}
		}
		printMatrix(M);
		
		// Crie matriz de coordinados em y (colunas)
		int [][] N = new  int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				N[i][j] = j;
			}
		}
		printMatrix(N);
		
	 }
	 
	public static void printMatrix(int [][] M)	
	{ 
	 	int m = M.length;
	 	int n = M[0].length;
	 	System.out.println("Matriz tem:\n" + m + 
			" filas\n" + n + " colunas.");
	 	for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				System.out.printf("%2d ",M[i][j]);
			}
		System.out.println("");
		}
	}
}
