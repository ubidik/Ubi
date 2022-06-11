package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		
		int num=100;
		num=num+100;
		
		System.out.println(num);//200
		
		num= num+50;
		
		System.out.println(num);//250
		
		num+=100; // num=num+100 // 350
		
		num-=10; // num=num-10; 340
		
		System.out.println(num);
		
		num/=10; // num=num/10; //34
		
		System.out.println(num);
		
		num*=2; // num=num*2 //68
		
		System.out.println(num);
		
		num%=2;
		
		System.out.println(num); //0
		
		/////
		
		 int x;
		    
	   	 x = 7;
	   	 x += 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x -= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x *= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x /= 4;
	   	 System.out.println(x);
	    
	   	 x = 7;
	   	 x %= 4;
	   	 System.out.println(x);
		
		
		

	}

}
