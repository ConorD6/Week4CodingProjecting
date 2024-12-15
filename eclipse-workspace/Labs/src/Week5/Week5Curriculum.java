package Week5;

public class Week5Curriculum {

	public static void main(String[] args) {
		
		/*
		 * Objected Oriented Programming (OOP)
		 * 
		 * DVD PLayer - 
		 * Properties Included:
		 * -Height
		 * -Weight
		 * -Width
		 * -Color
		 * 
		 * Also has THINGS it can do (Things = Methods)
		 * Functionality:
		 * -Play
		 * -Fast Forward
		 * -Rewind
		 * -Pause
		 * 
		 * DVD
		 * Properties:
		 * - Movie Length
		 * - Image
		 * - Size
		 * 
		 * Functionality:
		 * - Store
		 * 
		 * 
		 * FOUR PILLARS of OOP
		 * 1. Abstraction
		 * Ex - Triangle -We don't know the measures of each side of a triangle, but know that it is on
		 * because there are 3 sides
		 * Ex - Table - Features, has a top and lengths or is something we can use to put stuff on
		 * 2. Encapsulation
		 * Driving a car - Only need to know how to use it ( turn on, gas pedal, breaks) We dont need to tell the car to fire a piston
		 * 3. Inheritance
		 * Inherit from parent objects, or classes to be more precise.
		 * 4. Polymorphism
		 * Animals communicate, but how they communicate is different. 
		 * Dog barks, Cat meows, Bear roars
		 * The "method" communicate can take different forms.
		 * 
		 * Class - is how we structure our code in OOP.
		 * Class is like a blueprint, while an Object is the actual product developed from blueprint
		 * An Object is an instance of a Class. Ex blueprint to House
		 * 
		 * 
		 */
		
		StringBuilder name = new StringBuilder();
		StringBuilder name2 = new StringBuilder();
		
		Student student1 = new Student();
		student1.firstName = "Tom";
		student1.lastName = "Smith";
		student1.gradeLevel = 12;
		student1.phoneNumber = "530-251-6060";
		
		student1.introduce();
		
		Student student2 = new Student("Sammy" , "Jones");
		student2.introduce();
		
		Student student3 = new Student("Tom", "Riddle", "530-251-6060", 11);
;		student3.introduce();

	}

}
