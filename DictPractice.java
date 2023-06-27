public class DictPractice {
	public static main(String[] args){
		 Map<String,String> englSpanDictionary = new HashMap<String,String>();
		 //Putting things inside our dictionary
		 englSpanDictionary.put("Monday","Lunes");
		 englSpanDictionary.put("Tuesday","Martes");

		 // Retrieve things from our dictionary
		 System.out.println(englSpanDictionary.get("Monday"));

		 // Print out all keys
		 System.out.println(englSpanDictionary.keySet());
		 // Print out all values
		 System.out.println(englSpanDictionary.values());

		 // Print out size
		 System.out.println(englSpanDictionary.size());




		
		}
}






