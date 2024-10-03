import java.util.Arrays; 
public class ArrayReverse{
	public static void main(String[] args){
		ReverseString();		
	}
	public static void ReverseString(){
	String[] sentence = {"There", "is", "a", "tide", "in", "the", "affairs", "of", "men"};

		for(int count = sentence.length-1; count >= 0; count--){
		System.out.print(sentence[count]+" ");
		}

	} 
}