package pattern;

public class patterns {

	public static void main(String[] args) {
		pattern28(5);

	}

	public static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	public static void pattern2(int n) {

		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row - 1; col++) {
				System.out.print(col);
			}
			System.out.println(row);
		}
	}

	public static void pattern5(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int totalOfRowInComlumn = row > n ? 2 * n - row : row;
			for (int col = 1; col <= totalOfRowInComlumn; col++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public static void pattern6(int n) {
		for(int row = 1; row <= n; row++) {
			int totalRowOfColumn = row > n? n - row: row;
			int totalOfSpace = n - totalRowOfColumn;
			for(int space = 1; space<=totalOfSpace; space++ ) {
				System.out.print(" ");
			}
			for(int col = 1; col<= totalRowOfColumn; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n) {
		for(int row = 1; row<=n ; row++) {
			int totalRowOfColumn = row > n ? row: n - row + 1;
			int totalOfSpace = n - totalRowOfColumn;
			for(int space = 1; space<=totalOfSpace; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col<=totalRowOfColumn; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
 	public static void pattern10(int n) {
		for(int row = 1; row<=n; row++) {
			int totalRowOfColumn = row > n ? n -row: row;
			int totalOfSpace = n -totalRowOfColumn;
			for(int space = 1; space<=totalOfSpace; space++){
				System.out.print(" ");
			}
			for(int col = 1; col<= totalRowOfColumn; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
 	public static void pattern11(int n) {
		for(int row = 1; row<=n ; row++) {
			int totalRowOfColumn = row > n ? row: n - row + 1;
			int totalOfSpace = n - totalRowOfColumn;
			for(int space = 1; space<=totalOfSpace; space++) {
				System.out.print(" ");
			}
			for(int col = 1; col<=totalRowOfColumn; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
 	public static void pattern28(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int totalrowOfColumns = row > n ? 2 * n - row : row;
			int numberOfSpace = n - totalrowOfColumns;
			for (int space = 1; space <= numberOfSpace; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= totalrowOfColumns; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}