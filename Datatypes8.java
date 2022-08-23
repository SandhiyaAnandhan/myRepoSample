package datatypes;

public class Datatypes8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte by1 = -128;
		byte by2 = 127;   //Byte ranges from -128 to 127
		short s1 = -32768;
		short s2 = 32767;   //Short ranges from -32768 to 32767
		int i1 = -2147483648;
		int i2 = 2147483647;   //Integer ranges from -2^31 to 2^31-1
		long l1 = -9223372036854775808L;
		long l2 = 9223372036854775807L;  //Long ranges from -2^63 to 2^63-1
		float f1 = -41.19F;
		float f2 = 47.24F;   //Float ranges from 1.4e-045 to 3.4e+038
		double d1 = -310.68D;
		double d2 = 312.89D;  //Double ranges from 4.9e-324 to 1.8e+308
		char ch1 = '0';
		char ch2 = '9';  //Char ranges from 0 to 65535
		boolean b1 = true;
		boolean b2 = false;  //NA 
		
		
	System.out.println("Byte = "+by1+" to "+by2);
	System.out.println("short = "+s1+" to "+s2);
	System.out.println("int = "+i1+" to "+i2);
	System.out.println("long = "+l1+" to "+l2);
	System.out.println("float = "+f1+" to "+f2);
	System.out.println("double = "+l1+" to "+l2);
	System.out.println("char = "+ch1+", "+ch2);
	System.out.println("boolean = "+b1+" or "+b2);
	
	
		

	}

}
