package com.rbu;

public class FloatDataTypesExample 
{
	public static void main(String[] args) 
	{
	// for  decimal numbers having precision 6 to 7 we can go with float
		float dolerToRupe=83.151456f;
		System.out.print("1$ in rupes =");
		System.out.println(dolerToRupe-2);
		
	//more precisions than float we can use double 
		double dolerToGold=0.00048914;
		System.out.print("1$ in gold grams  =");
		System.out.println(dolerToGold);
	}

}
