import java.util.*;

public class Ciudades {

	public static void main(String[] args) {
		// Fase1
		
		String city1, city2, city3, city4, city5, city6;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce una Ciudad: ");
		city1 = input.next();
		System.out.println("Introduce una Ciudad: ");
		city2 = input.next();
		System.out.println("Introduce una Ciudad: ");
		city3 = input.next();
		System.out.println("Introduce una Ciudad: ");
		city4 = input.next();
		System.out.println("Introduce una Ciudad: ");
		city5 = input.next();
		System.out.println("Introduce una Ciudad: ");
		city6 = input.next();
		
		System.out.println(city1+", "+city2+", "+city3+", "+city4+", "+city5+", "+city6);
		
		//Fase2
		
		String[] arrayCities = {city1,city2,city3,city4,city5,city6};
		
		Arrays.sort(arrayCities);
		
		System.out.println(Arrays.toString(arrayCities));
			
		
		// Fase3
		
		String [] arrayCitiesModified= new String[arrayCities.length];
		int counter = 0;
		
		for (String city : arrayCities) {
			
			arrayCitiesModified [counter]= city.replace('a', '4').replace('A','4');
			counter++;
		}
		
		System.out.println(Arrays.toString(arrayCitiesModified));
		
		//Fase4
		
		char[] arrayCity1= new char[arrayCities[0].length()];
		char[] arrayCity2= new char[arrayCities[1].length()];
		char[] arrayCity3= new char[arrayCities[2].length()];
		char[] arrayCity4= new char[arrayCities[3].length()];
		char[] arrayCity5= new char[arrayCities[4].length()];
		char[] arrayCity6= new char[arrayCities[5].length()];
		
		for (int i=0; i<arrayCity1.length;i++) {
			arrayCity1[i]=arrayCities[0].charAt(i);
			
		}
		for (int i=0; i<arrayCity2.length;i++) {
			arrayCity2[i]=arrayCities[1].charAt(i);
			
		}
		for (int i=0; i<arrayCity3.length;i++) {
			arrayCity3[i]=arrayCities[2].charAt(i);
			
		}
		for (int i=0; i<arrayCity4.length;i++) {
			arrayCity4[i]=arrayCities[3].charAt(i);
			
		}
		for (int i=0; i<arrayCity5.length;i++) {
			arrayCity5[i]=arrayCities[4].charAt(i);
			
		}
		for (int i=0; i<arrayCity6.length;i++) {
			arrayCity6[i]=arrayCities[5].charAt(i);
			
		}
		System.out.println(Arrays.toString(arrayCity1));
		System.out.println(Arrays.toString(arrayCity2));
		System.out.println(Arrays.toString(arrayCity3));
		System.out.println(Arrays.toString(arrayCity4));
		System.out.println(Arrays.toString(arrayCity5));
		System.out.println(Arrays.toString(arrayCity6));
		

	}

}