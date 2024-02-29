package javaBasic;

public class IntroSession {

	public static void main(String[] args) {

		
		/* <<<<<<<<<<<<<<<<Java Operators>>>>>>>>>>>>>>>>>>> */
			    
		//Arithmetic operators
			    // declare variables
			    int a = 12, b = 5;

			    // addition operator
			    System.out.println("a + b = " + (a + b));

			    // subtraction operator
			    System.out.println("a - b = " + (a - b));

			    // multiplication operator
			    System.out.println("a * b = " + (a * b));

			    // division operator
			    System.out.println("a / b = " + (a / b));

			    // modulo operator
			    System.out.println("a % b = " + (a % b));
			    
			    
		// Assignment operators
	
			    // create variables
	    	    int var;

	    	    // assign value using =
	    	    var = a;
	    	    System.out.println("var using =: " + var);

	    	    // assign value using =+
	    	    var += a;
	    	    System.out.println("var using +=: " + var);

	    	    // assign value using =*
	    	    var *= a;
	    	    System.out.println("var using *=: " + var);
	    	    
	    	    
	    // Relational Operators
	    	    
	    	    // value of a and b
	    	    System.out.println("a is " + a + " and b is " + b);

	    	    // == operator
	    	    System.out.println(a == b);  // false

	    	    // != operator
	    	    System.out.println(a != b);  // true

	    	    // > operator
	    	    System.out.println(a > b);  // false

	    	    // < operator
	    	    System.out.println(a < b);  // true

	    	    // >= operator
	    	    System.out.println(a >= b);  // false

	    	    // <= operator
	    	    System.out.println(a <= b);  // true
	    	    
	    	    
	    //Logical operators
	    	    
	    	    // && or AND operator
	    	    System.out.println((5 > 3) && (8 > 5));  // true
	    	    System.out.println((5 > 3) && (8 < 5));  // false

	    	    // || or OR operator
	    	    System.out.println((5 < 3) || (8 > 5));  // true
	    	    System.out.println((5 > 3) || (8 < 5));  // true
	    	    System.out.println((5 < 3) || (8 < 5));  // false

	    	    // ! or NOT operator
	    	    System.out.println(!(5 == 3));  // true
	    	    System.out.println(!(5 > 3));  // false
	    	    
   	    //Increment and Decrement Operators
	    	    
	    	 // declare variables
	    	    int result1, result2;

	    	    // original value
	    	    System.out.println("Value of a: " + a);

	    	    // increment operator
	    	    result1 = ++a;
	    	    System.out.println("After increment: " + result1);

	    	    System.out.println("Value of b: " + b);

	    	    // decrement operator
	    	    result2 = --b;
	    	    System.out.println("After decrement: " + result2);
	   
	    	    
	    	    
	   /* <<<<<<<<<<<<<<<< Output and Input System >>>>>>>>>>>>>>>> */
	    	    
		// Java output - print() and println()	  
	    	    System.out.println("1. println ");
	            System.out.println("2. println ");
	        	
	            System.out.print("1. print ");
	            System.out.print("2. print");
	            
	   // Print Concatenated Strings
	            Double number = -10.6;
	            System.out.println("I am " + "awesome.");
	            System.out.println("Number = " + number);
	            
	            
	}

}
