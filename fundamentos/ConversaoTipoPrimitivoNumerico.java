package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		//conversão implícita
		double a = 5;
		System.out.println(a);
		
		//conversão explícita (cast) - está ciente de que pode perder informação
		float b = (float) 1.5874989999997;
		System.out.println(b);

		int i = 1000;
		byte by = (byte) i;
		System.out.println(by);
		
		double d = 7.5;
		int in = (int) d;
		System.out.println(in);
	}

}
