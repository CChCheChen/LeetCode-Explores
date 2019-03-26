package b_array2D;


/*
Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

Note:

The total number of elements of the given matrix will not exceed 10,000.
 */

public class B_Diagonal_Traverse {

	public static void main(String[] args) {
		int rows = 1;
		int cols= 3;
		int[][] input = new int[rows][cols];
		
		input[0] = new int[]{1, 2, 3};
		//input[1] = new int[]{4, 5, 6};
		//input[2] = new int[]{7, 8, 9};
		
		System.out.println("Before Traversing:");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
		
		int[] output = diagonalTraverse(input, rows, cols);
		for(int i : output)
			System.out.print(i + " ");

	}

	private static int[] diagonalTraverse(int[][] input, int rows, int cols) {
		int rowIndex = 0;
		int colIndex = 0;
		int outputIndex = 0;
		
		boolean positiveDir = true;// positive direction is up-right direction
		                           //!positive direction is bottom-left direction
		
		int[] output = new int[rows*cols];

		while(rowIndex<rows && colIndex<cols) {

			output[outputIndex] = input[rowIndex][colIndex];
			System.out.println(input[rowIndex][colIndex]);
			
			if((rowIndex == 0 || rowIndex == rows-1) && colIndex<cols-1) {
				colIndex++;
				outputIndex++;
				output[outputIndex] = input[rowIndex][colIndex];
				
				if(rowIndex == 0) {
					if(rows > 1) {
						rowIndex++;
						colIndex--;
						positiveDir = false;
					}else {
						colIndex++;
					}
					
				}else {
					rowIndex--;
				    colIndex++;
					positiveDir = true;
				}
				
				outputIndex++;
				
			}else if((colIndex == 0 || colIndex == cols-1) && rowIndex<rows-1) {
				rowIndex++;
				outputIndex++;
				output[outputIndex] = input[rowIndex][colIndex];
				
				if(colIndex == 0) {
					if(cols > 1) {
						colIndex++;
						rowIndex--;
						positiveDir = true;
					}else {
						rowIndex++;
					}
					
				}else {
					rowIndex++;
					colIndex--;
					positiveDir = false;
				}
				
				outputIndex++;
				
			}else {
				if(positiveDir) {
					rowIndex--;
					colIndex++;
					
				}else{
					rowIndex++;
					colIndex--;
				}
				
				outputIndex++;
			}
			
			System.out.println("rowIndex=" + rowIndex + " && colIndex=" + colIndex);
			System.out.println("positiveDir=" + positiveDir);
		}
		
		return output;
	}

	public static void helper(boolean positiveDir, int rowIndex, int colIndex, int outputIndex) {
		if(positiveDir) {
			rowIndex--;
			colIndex++;
			
		}else{
			rowIndex++;
			colIndex--;
		}
		
		outputIndex++;
	}

}
