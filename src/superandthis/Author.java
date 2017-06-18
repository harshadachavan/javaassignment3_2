package superandthis;
/*
 * This is the child class which extends the parent class person
 * */
public class Author extends Person {
	String name;
	String book;
	//Creating a parameterized constructor of child class
	Author(String name,String book) {
		
		super(); // This super will call the constructor of parent class. 
	    System.out.println("Author class Constructor");
	    
	    /*
	     * The this keyword can be used to refer current class instance variable. If there is ambiguity 
	     * between the instance variables and parameters, this keyword resolves the problem of ambiguity.
	     * */
	    this.book = book;
	    
	    //We can use super keyword to access the data member or field of parent class.
	    //It is used if parent class and child class have same fields.
	    //E.g we have String name is both classes with different values
	    System.out.println("Person name is : "+super.name);//prints Name of Person class
	    System.out.println("Author name is : "+name);//prints Name of Author Class  
	    System.out.println("Book authored by "+name+" is "+book);
	    
	}
	/*
	 * Here we have created a method with passing variables to it
	 * and used this keyword to assign values to it.
	 * */
	void display (String name,String book) {
		this.name = name;
		this.book = book;
		System.out.println("Name of other Author : "+ name);
		System.out.println("book Authored By  : "+ name+" is "+book);
	}
	
	
}
