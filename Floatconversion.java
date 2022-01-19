class Floatconversion {
	public static void main(String[]args){
		
		float num=12987788f;//widning//
		byte s=(byte)num;
		System.out.println(s);
		
	short i=(short)num;//narrowing//
	System.out.println(i);
	
	int j=(int)num;//narrowing//
	System.out.println(i);
	
	float f=num;//widning//
	System.out.println(f);
	
	long l=(long)num;//narrowing//
	System.out.println(l);
	
	double d=num;//narrowing//
	System.out.println(d);
	//narrowing//
	char h=num;
	System.out.println(f); //Ascii//
	
	
	}
}
