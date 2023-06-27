import java.util.*;
class DictTask {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		Map<String, Integer> contactBook = new HashMap<String, Integer>();

		for(int i=0; i< n; i++){
			String name = input.next();
			int phone = input.nextInt();
			contactBook.put(name, phone);
		}
		for(String key : contactBook.keySet()){
			int value = contactBook.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
		}
	}
}


