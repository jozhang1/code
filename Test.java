import java.util.*;
public class Test{
    
	public Test(){

    }
    public void check(boolean[][]matrix)
    {
        for(int i=0;i<matrix.length;i++){
            if(checks(i,matrix)==true)
            {
                for(int j=0;j<matrix[0].length;j++)
                    System.out.print(matrix[i][k]+" ");
            }
        }
    }
    private boolean checks(int current,boolean[][]matrix)
    {
        for(int j=current+1;j<matrix.length;j++){
            for(int k=0;k<matrix[0].length;j++){
                if(matrix[current][k]==matrix[j][k])
                    return false;
            }
        }
        return true;
    }
}