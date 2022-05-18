import java.util.Scanner;

public class Rev_Two_D {
	
	static int col;
	static int row;
	static int[][] trans_arr=new int[col][row];

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		row=m;
		int n=sc.nextInt();
		col=n;
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
				System.out.print( arr[i][j]+"");
			}
			System.out.println();
		}
		 for (int j = 0; j < arr.length; j++) {
	            for (int i = 0; i < arr[j].length / 2; i++) {
	                int temp = arr[j][i];
	                arr[j][i] = arr[j][arr[j].length - i - 1];
	                arr[j][arr[j].length - i - 1] = temp;
			}
		}
		for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


