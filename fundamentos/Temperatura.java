package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		
		double fahrenheit = 86;
		double fahrenheitToCelsius = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " Fahrenheit em Celsius é: " + fahrenheitToCelsius + "\n");

		
		fahrenheit = 32;
		fahrenheitToCelsius = (fahrenheit - 32) * 5/9;
		System.out.println(fahrenheit + " Fahrenheit em Celsius é: " + fahrenheitToCelsius);
	}
}
