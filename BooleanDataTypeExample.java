package com.rbu;

public class BooleanDataTypeExample 
{
	public static void main(String[] args) 
	{
		//boolean can hold only true or false keyword
		boolean areYouIndian=false;
		System.out.print("CITIZEN of INDIA=");
		System.out.println(areYouIndian);
		
		boolean livingOutsideIndia=false;
		System.out.print("LIVING outside of INDIA=");
		System.out.println(livingOutsideIndia);
		
		//control statements if switch

		if(areYouIndian) {
			System.out.println("you can apply for adhar");
		}
		else {
			System.out.println("you are not indian so you cant get adhar");
		}
		
		
		
	}

}
