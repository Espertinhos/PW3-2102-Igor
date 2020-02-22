
public class Piscina {
	
	public static void main(String[] args) {
		
		int diametro = 6;
		double custo = 75;
		System.out.println(total(diametro));
		
	}
	
	public static double raio(int diametro) {
		
		return diametro / 2;
		
	}
	
	 public static double area(double raio) {
		 
		 return Math.PI * Math.pow(raio, 2);
		 
	 }
	 
	 public static double total(int diametro) {
		 
		 double raio = raio(diametro);
		 double area = area(raio);
		 return area * 75;
		 
	 }
	 
	
	
	
	
	
	
	

}
