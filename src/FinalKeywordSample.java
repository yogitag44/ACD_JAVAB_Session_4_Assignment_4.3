import java.util.Scanner;   //package  to get input from user

//============================use of FINAL keyword===============================
class FinalKeywordSample {
	
	//=============================Final Variable=========================
	
	final int RandomeNum = 65;     //integer value assigned to final variable
	final int NewNum;				//unassigned final variable

	 FinalKeywordSample() {  //constructor of main class "FinalKeywordSample"
		 NewNum = 56;   //Value assigned to Final variable to further use in another method
	}

	
	 void testMethod() {    //Simple method to test final variables
		 
		 //trying to assign value to final variable
		 System.out.println("Tried assigning value to final variable and got \n \"Error: The final field cannot be assigned\"");
		// RandomeNum = 776;    //we can not write this statement as this will throw error
		 					 //Error: The final field cannot be assigned
		 System.out.println("\n==========Calling final varibale using constructor of the class=========");
		 System.out.println("final keyword variable defined in constructor and value is: "+ NewNum);  //Can get value of final variable inside another method
		 							//As this variable is coming from constructor
	 }
	 
	 
	 public static void main(String arg[]) {
		 
		 FinalKeywordSample sampleObj = new FinalKeywordSample();  //creating object of main class
		 sampleObj.testMethod();   //calling simple method defined in the main class.
	 
		 DemoChild DObj = new DemoChild();   //created object of child class with no method
		 
		 DObj.FinalParentChild();   //calling method of parent class using object of child class
	 
	 }
	 
}


class DemoParent{
	//=================Final Method==========================
	final void FinalParentChild() {   //method declared as final with final keyword
		
		System.out.println("\n\n===============Calling final Method defined in Parent class using object of child class======");
		System.out.println("Parent class wih final METHOD \"FinalParent()\"");
	}
}

class DemoChild extends DemoParent{   //child class extending parent class DemoParent
	
	//Can not override the parent final method but if we are creating object 
	//of child class and calling the final method it will return the output
	
	//===============trying to override Method================ 
	//void FinalParentChild() {
	//	System.out.println("Can not override the parent class:");
	//}
}


//============Final Class===================
final class FinalClassDemo{
	
}

//We will get an error while trying to extend a final class

/*class ChildFinalClass extends FinalClassDemo{
	
}*/
