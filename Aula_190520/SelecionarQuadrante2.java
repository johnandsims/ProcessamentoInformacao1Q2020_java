
public class SelecionarQuadrante2{
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

		// Multiplicar Q4 por 2:
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){
				if (i >= row/2 && j >= col/2) 
					M[i][j] = 2 * M[i][j];
			}
		}
		System.out.println("Matriz com duas vezes Q4");			
		printMatrix(M);
		
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
