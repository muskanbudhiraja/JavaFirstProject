package com.sapient.matrix;

public class Matrix_Runner {

	public static void main(String[] args) {
		int[][] m1=new int[][]{{1,2},{3,5},{8,6}};
		int[][] m2=new int[][] {{2,5,6},{1,6,4}};
		Matrix matrix1=new Matrix(m1);
		matrix1.displayMatrix();
		Matrix matrix2=new Matrix(matrix1.addMatrix(m2));
		matrix2.displayMatrix();
//		matrix1.readMatrix(m1);
//		matrix1.displayMatrix();
//		int[][] result=matrix1.multiplyMatrix(m2);
//		Matrix matrix2=new Matrix(3,3);
//		matrix2.readMatrix(result);
//		matrix2.displayMatrix();
		
		
		
	}

}
