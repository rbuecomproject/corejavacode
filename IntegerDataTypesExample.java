package com.rbu;

public class IntegerDataTypesExample 
{
	public static void main(String[] args) 
	{
	// for very short non decimal numbers between -128 to 127 byte
		byte age=100;
		System.out.print("Age =");
		System.out.println(age-10);
		
	//more than byte range we use short -32768 to 32767
		short salary=32767;
		System.out.print("Salary  =");
		System.out.println(salary*2);//store results in int
		
	//more than short range we use int -2147483648 to 2147483647
		int indiaPopulation=1400000000;
		System.out.print("India population  =");
		System.out.println(indiaPopulation);
		
	//more than int range we use long -9223372036854775808 to 9223372036854775807
		long distanceToSun=150000000000l;//add alphabet l the ending to identify it as long
		System.out.print("Distance To Sun in meters  =");
		System.out.println(distanceToSun);	
		
	}
}
