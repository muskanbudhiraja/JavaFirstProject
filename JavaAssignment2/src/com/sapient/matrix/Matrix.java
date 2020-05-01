package com.sapient.matrix;

public class Matrix {
	int row,col;
	int[][] matrix;
	public Matrix()
	{
		this.row=3;
		this.col=3;
		matrix=new int[row][col];
	}
	public Matrix(int row,int col)
	{
		this.row=row;
		this.col=col;
		matrix=new int[row][col];
	}
	public Matrix(int[][] values)
	{
		if(values==null)
			System.out.println("no matrix");
		else {
		this.row=values.length;
		this.col=values[0].length;
		matrix=new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				this.matrix[i][j]=values[i][j];
			}
		}
		}
	}
	public Matrix(Matrix ob)
	{
		//this.matrix=ob.matrix.clone();
		this.row=ob.matrix.length;
		this.col=ob.matrix[0].length;
		matrix=new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				matrix[i][j]=ob.matrix[i][j];
			}
		}
	}
	void readMatrix(int[][] values)
	{
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				matrix[i][j]=values[i][j];
			}
		}
		
	}
	void displayMatrix()
	{
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	int[][] addMatrix(int[][] values)
	{
		int rows=values.length;
		int cols=values[0].length;
		if(row!=rows || col!=cols) {
			System.out.println("addition is not possible");
			return null;
		}
		else {
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<col; j++)
				{
					values[i][j]+=matrix[i][j];
				}
			}
		}
		return values;
	}
	boolean isScalar()
	{
		if(row!=col)
			return false;
		else{
			int x=matrix[0][0];
			for(int i=0;i<row; i++)
			{
				for(int j=0; j<col; j++)
				{
					if(i!=j && matrix[i][j]!=0)
						return false;
					if(i==j && matrix[i][j]!=x)
						return false;
				}
			}
		}
		return true;
	}
	int[][] multiplyMatrix(int[][] values)
	{
		int rows=values.length;
		int cols=values[0].length;
		int [][]multiply;
		if(col!=rows) {
			System.out.println("Multiplication is not possible");
			return null;
		}
		else
		{
			multiply= new int[row][cols];
			for(int i=0; i<row; i++)
			{
				for(int j=0; j<cols; j++)
				{
					for(int k=0;k<col; k++)
					{
						multiply[i][j]+=matrix[i][k]*values[k][j];
					}
				}
			}
			
		}
		return multiply;
	}
}
	