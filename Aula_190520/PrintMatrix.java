public class PrintMatrix{
	public static void main(String args[])
	{
		int row = 2; 
		int col = 3;
		int count = row * col;
		
		int [][] M = new  int [row][col];
		for (int i = 0; i < row ; i++){  // get a row value
			for (int j = 0; j < col; j++){ // iterate across columns
				M[i][j]=count;
				count--;
			}
		}
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
				System.out.printf("%2d ",M[i][j]); // what is "%2d "?
			}
		System.out.println("");
		}
	}
}
