package ovningar;

public class zoo {
	
	public static void main(String [] args) {
		
		animals [] blender = {new tiger(), new monkey(), new turtle()};
		
		for(animals animals: blender) {
			
			animals.name();
			animals.eat();
			animals.sleep();
			animals.propagate();
			System.out.println();
		}
		
	}

}
