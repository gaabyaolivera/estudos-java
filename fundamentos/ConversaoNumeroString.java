package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer n1 = 1000;
		String n1String = n1.toString();
		System.out.println(n1String.length());
		
		int n2 = 524;
		System.out.println(Integer.toString(n2));
		
		System.out.println("" + n2);
}
}
