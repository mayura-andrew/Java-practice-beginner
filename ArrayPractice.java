import java.util.Scanner;

public class ArrayPractice{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int count;
		count = myObj.nextInt();
		int intArray[] = new int[count];
		System.out.println("Enter the number");
	

		for(int i=0; i < count; i++){
			intArray[i] = myObj.nextInt();
		}

		for(int i= intArray.length - 1; i >=0; i--){
			System.out.println(intArray[i]);
		}
	}
}

