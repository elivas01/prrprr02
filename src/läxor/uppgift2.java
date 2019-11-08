package läxor;

import java.util.ArrayList;

public class uppgift2 {
	
	public static void main(String[] args) {
		String ord = "blender";
		
		ArrayList<String> list = new ArrayList<String>();
		
		String resultat = metrev(ord, ord.length() -1, list);
		
		System.out.println(resultat);
		
	}
	
	public static String metrev(String ord, int index, 
			ArrayList<String> letters) {
		String result ="";
		
		
		letters.add(String.valueOf(ord.charAt(index)));
		
		
		if(index != 0) 
		{
		metrev(ord, index--, letters);
		}
		
		result = letters.toString();
		return result;
	}

}
