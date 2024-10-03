import java.util.Arrays; 
public class ArrayReverse{
	public static void main(String[] args){
		ReverseString();		
	}
	public static void ReverseString(){
	String[] sentence = {"There", "is", "a", "tide", "in", "the", "affairs", "of", "men"};
	String[] reversed = new String[sentence.length];

		for(int count = 0;count <= sentence.length;count++){
			reversed[sentence.length] = sentence[count];
		}
		System.out.print(Arrays.toString(reversed));
	} 
}