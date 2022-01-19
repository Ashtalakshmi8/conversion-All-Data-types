class Shortconversion {
	public static void main(String[]args){
		short num=19;
		byte s=(byte)num;//narrowing//
		System.out.println(s);
	
	int i=num;//widning//
	System.out.println(i);
	
	float f=num;//widning//
	System.out.println(f);
	
	long l=num;//widning//
	System.out.println(l);
	
	double d=num;//widning//
	System.out.println(d);
	//narrowing//
	char b=(char)num;
	System.out.println(b);
	
	
	}
}
