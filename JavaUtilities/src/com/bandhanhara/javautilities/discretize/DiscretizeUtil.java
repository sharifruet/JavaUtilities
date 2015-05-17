package com.bandhanhara.javautilities.discretize;
import java.util.Arrays;



public class DiscretizeUtil {

	public static void main(String[] args) {
		System.out.println("1-d Example:");
		double data1d[] = {1.1, 9.1, 9.4, 4.2, 5.5, 6.1, 7.3, 8.2, 9.9, 10.0};
		int bin[] = binary(data1d);
		for(int i:bin) System.out.print(i+"\t");
		
		
		System.out.println("\n2-d Example:");
		double data2d[][] = {{1.1, 9.1, 9.4}, {4.2, 5.5, 6.1}, {7.3, 8.2, 9.9} };
		int bin2d[][] = binary(data2d);
		for(int r[]:bin2d){
			for(int v:r){
				System.out.print(v+"\t");
			}
			System.out.println();
		}
		
	}
	
	/**
	 * Binary discretization of data. Data are classified into two classes based on equal width.<br/>
	 * Data in first class are transforms into 0 and second one into 1.<br/><br/>
	 * 
	 * Example:<br/>
	 * [1.2, 3.4, 7.6, 6.9, 2.1] transforms into [0, 0, 1, 1, 0]
	 * 
	 * @param data, double array of input data
	 * @return int array of binary representation of data
	 * @author Sharif Uddin
	 * @since May 17, 2015
	 */
	public static int []binary(double[] data){
		int size = data.length;
		double threshold;
		int[] binaryData = new int[size];
		double repData[] = data.clone();
		Arrays.sort(repData);
		threshold = (repData[size-1]+repData[0])/2;
		for(int i=0;i<size;i++)
			binaryData[i] = data[i]>threshold?1:0;
		
		return binaryData;
	}
	
	/**
	 * Binary discretization of data. Data are classified into two classes based on equal width.<br/>
	 * Data in first class are transforms into 0 and second one into 1.<br/><br/>
	 * 
	 * Example:<br/>
	 * [[1.2, 3.4], [7.6, 6.9], [2.1, 6.1]] transforms into [[0, 0], [1, 1], [0, 1]]
	 * 
	 * @param data, double array of input data
	 * @return int array of binary representation of data
	 * @author Sharif Uddin
	 * @since May 17, 2015
	 */
	public static int [][]binary(double[][] data){
		int rows = data.length;
		int cols = data[0].length;
		double threshold;
		double max=data[0][0];
		double min=data[0][0];
		int binaryData[][] = new int[rows][cols];
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++){
				if(data[i][j]>max)
					max = data[i][j];
				if(data[i][j]<min)
					min = data[i][j];
			}
		threshold = (max+min)/2;
		
		for(int i=0;i<rows;i++)
			for(int j=0;j<cols;j++)
				binaryData[i][j] = data[i][j]>threshold?1:0;
		
		return binaryData;
	}


}
