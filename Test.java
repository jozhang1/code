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
        for(int j=i-1;j>=0;j--){
            for(int k=0;k<matrix[0].length;j++){
                if(matrix[current][k]==matrix[j][k])
                    return false;
            }
        }
        return true;
    }
    
    public void check2(boolean[][]matrix)
    {
        TreeNode root = null;
        for(int i=0;i<matrix.length;i++){
            if(insert(matrix,root,i,0)){
                for(int j=0;j<matrix[0].length;j++)
                    System.out.print(matrix[i][j]+" ");
            }
        }
    }
    private boolean insert(boolean[][]matrix,TreeNode root, int row, int column)
    {
        if(root==null)
            root=new TreeNode();
        if(column<matrix[0].length){
            return insert(matrix, root.child[matrix[row][column]],row,column+1);
        }
        else{
            if(!root.isEnd)
                return root.isEnd=true;
            return false;
        }
    }
}