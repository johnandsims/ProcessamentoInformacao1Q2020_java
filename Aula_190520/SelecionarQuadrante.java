
public class SelecionarQuadrante{
	public static void main(String args[])
	{
		int row = 8; 
		int col = 6;
		int count = 0;
		
		// Criamos matriz
		int [][] M = new int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				M[i][j] = i * col + j;
			}
		}
		System.out.println("Matriz de valores:");
		printMatrix(M);
		
		// Crie matriz de coordinados em filas
		int [][] F = new  int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				F[i][j] = i;
			}
		}
		System.out.println("Matriz de Coordinados - Filas:");
		printMatrix(F);
		
		// Crie matriz de coordinados em colunas
		int [][] C = new  int [row][col];
		for (int i = 0; i < row ; i++){  
			for (int j = 0; j < col; j++){ 
				C[i][j] = j;
			}
		}
		System.out.println("Matriz de Coordinados - Colunas:");			
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
				System.out.printf("%2d ",M[i][j]);
			}
		System.out.println("");
		}
	}
}
