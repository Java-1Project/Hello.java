class B extends A 
{
	int y=20;
	{
		System.out.println("B Value y"+y);
		System.out.println("A Value x"+x);
	}
	public static void main(String[] args) 
	{
		B b1=new B();
	}
}
