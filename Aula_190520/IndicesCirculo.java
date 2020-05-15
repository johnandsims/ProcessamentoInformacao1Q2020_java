
public class IndicesCirculo{
	public static void main(String args[])
	{
		int row = 20; // row/2 = 4
		int col = 20; // col/2 = 3
		int count = 0;
		
		int [][] M = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				if ( (i-10)*(i-10) + (j-10)*(j-10) < 36)
					M[i][j] = 1;
			}
		}
		printMatrix(M);

		int [][] F = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				F[i][j] = i-10;
			}
		}
		printMatrix(F);	
			
		int [][] C = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				C[i][j] = j-10;
			}
		}
		printMatrix(C);			
	 }
	 
	public static void printMatrix(int [][] M)	
	{ 
	 	int m = M.length;
	 	int n = M[0].length;
	 	System.out.println("Matriz tem:\n" + m + 
			" filas\n" + n + " colunas.");
	 	for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				System.out.printf("%3d ",M[i][j]);
			}
		System.out.println("");
		}
	}
}
