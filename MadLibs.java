import java.util.Scanner;

public class MadLibs{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int inputs = scan.nextInt();

	for(int i=0; i<inputs;i++){
		String s = scan.next();
		String even = "";
		String odd = "";
		for(int j = 0; j < s.length(); j++){
			char letter = s.charAt(j);
			if (j%2==0) {
				even += letter;
			}else{
				odd += letter;
			}
		}
		System.out.println(even + " " + odd);
	}
	scan.close();
}
			
}