
public class Example33 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		boolean result;
		
		result = magic_square(matrix);
		System.out.println(result);
	}
	
	static boolean magic_square (int[][] matrix)
	{
		boolean result=true;
		int lenght = matrix.length;
		int sumForward = 0;
		
		for(int i=0; i<lenght; i++) //forward main diagonal
		{
			sumForward+=matrix[i][i];
		}
		
		for(int m=0; m<lenght; m++) //rows and columns
		{
			int sumRows=0;
			int sumColumns=0;
			for(int n=0; n<lenght; n++)
			{
				sumRows+=matrix[m][n];
				sumColumns+=matrix[n][m];
			}
			if(sumRows!=sumForward || sumColumns!=sumForward)
			{
				result=false;
				break;
			}
		}
		
		int sumBackward=0;
		for(int r=0; r<lenght; r++) //backward main diagonal
		{
			sumBackward+=matrix[r][lenght-1-r];
		}
		
		if(sumBackward!=sumForward)
			result=false;
		
		return result;
	}

}
