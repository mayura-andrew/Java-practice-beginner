import java.util.Scanner; // Import the Scanner class


public class ScannerExample{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		String userName;


		System.out.println("Enter User Name : ");
		userName = myObj.nextLine();


		System.out.println("User Name is: " + userName);

		myObj.close();
		
	}
}
