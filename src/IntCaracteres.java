
public class IntCaracteres {

	public static void main(String[] args) {
		
		char[] caracteres = new char[256];
		
		for(int i = 0; i < caracteres.length; i++) {
			
			caracteres[i] = (char) i;
			
		}
		
		for(int i = 0; i < caracteres.length; i++) {
			
			System.out.printf("%c ", caracteres[i]);
			
			if(i%20 == 0) {
				
				System.out.println();
				
			}
			
		}
		
	}

}
