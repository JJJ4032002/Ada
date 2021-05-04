import java.util.*;
public class Nqueen{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the size of matrix:");
      int size = sc.nextInt();
      int[][] arr = new int[size][size];
      if(nQueen(arr,0,size)){
         for(int i = 0; i<size; i++){
            for(int j = 0; j<size; j++){
             System.out.print(arr[i][j]+" ");;
            }
            System.out.print("\n");
         }
      }
      
   }
   
   public static boolean Check_safe(int[][] arr, int row, int col, int N){  
		int i, j;
		for (i = 0; i < col; i++)
			if (arr[row][i] == 1)
				return false;
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
			if (arr[i][j] == 1)
				return false;
		for (i = row, j = col; j >= 0 && i < N; i++, j--)
			if (arr[i][j] == 1)
				return false;
      return true;
   }
   
   public static boolean nQueen(int[][] arr, int col, int N){
      if (col >= N)
	   	return true;

		for (int i = 0; i < N; i++){
			if(Check_safe(arr, i, col,N)){
				arr[i][col] = 1;
				if (nQueen(arr, col + 1,N) == true)
					return true;
				arr[i][col] = 0; 
			}
		}
		return false;
   }
  
}