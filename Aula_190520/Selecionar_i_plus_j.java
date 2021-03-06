
public class Selecionar_i_plus_j{
	public static void main(String args[])
	{
		int row = 8; // row/2 = 4
		int col = 6; // col/2 = 3
		int count = 0;
		
		// Criamos matriz
		int [][] M = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				M[i][j] = i * col + j;
			}
		}

		// Selecionar elementos i+j > 3
		int [][] N = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){
				if (i + j >= 3) 
					N[i][j] = M[i][j];
			}
		}
		System.out.println("Matriz com duas vezes Q4");			
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
