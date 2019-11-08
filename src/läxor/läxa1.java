package läxor;

import java.util.ArrayList;

public class läxa1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> inList = new ArrayList<Integer>();
		
		inList.add(1);
		inList.add(1);
		inList.add(1);
		inList.add(1);
		inList.add(1);

		
		
		Integer resultat = summera(inList);
		
		System.out.println(resultat);
		
	}
	
	public static int summera(ArrayList<Integer> valueList) {
		int result = 0;
		
		for (int tal : valueList)
		{
			result +=tal;
			
		}
		
		return result; 
	}
	
}
				
	