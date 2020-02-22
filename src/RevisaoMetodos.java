
public class RevisaoMetodos {

	public static void main(String[] args) {
	int resultado = dobroProximo(2);
	
	System.out.println("Proximo:" + " "+ resultado);
		
	
	}
	
	public static int proximo(int num) {
		
		return num + 1;
		
	}
	
	public static int dobroProximo(int num) {
		
		return proximo(num )*2;
		
		
	}
	
	
	
	
	
	
	
}
