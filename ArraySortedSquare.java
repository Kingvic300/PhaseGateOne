import java.util.Arrays;
import java.util.Scanner; 
public class ArraySortedSquare{
	public static void main(String[] args){
	System.out.println(Arrays.toString(Integers()));
	System.out.println(Arrays.toString(Sort()));
	}
	public static int[] Integers(){
		int[] array = {2,1,3,4,9,5};
		int[] square = new int[array.length];
		for(int count = 0;count<array.length;count++){
			square[count] = array[count]*array[count];
				
		}
		return square;
	}
	public static int[] Sort(){
		int[] array = {2,1,3,4,9,5};
		int[] square = new int[array.length];
		for(int count = 0;count<array.length;count++){ 
			for(int counter = count;counter<array.length;counter++){
			square[count] = array[count]*array[count];
			if (square[counter]<square[counter+1]){
				square[counter]=square[counter+1];
			}
			}	
		}
		return square;
	}
}



