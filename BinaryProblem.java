import java.util.Scanner;

public class BinaryProblem{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		int count = 0;
		int max = 0;

		while(number > 0){
			int remainder = number % 2;

			if(remainder == 1){
				count++;
			}else{
				if(max < count){
					max = count;
				}
			}
			number = number/2;

		}
		
		if(max<count)
		max = count;
		System.out.println(max);

		input.close();
	}

}


