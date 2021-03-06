package b_array2D;

public class A_2D_Array {

	public static void main(String[] args) {
		System.out.println("Example 1:");
		int[][] a = new int[2][5];//2 rows and 5 columns
		printArray(a);
		
		System.out.println("Example 2:");
		int[][] b = new int[2][];
		printArray(b);
		
		System.out.println("Example 3:");
		b[0] = new int[3];
		b[1] = new int[5];
		printArray(b);

	}

	private static void printArray(int[][] a) {
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; null!=a[i] && j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
