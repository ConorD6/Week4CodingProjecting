package Week4;

public class Week4CodingProject {

	public static void main(String[] args) {
		 // 1. Create an array called 'ages' and initialize it with given values
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a. Subtract the first element from the last element programmatically
        int result = ages[ages.length - 1] - ages[0];// Access the last and first elements using dynamic indices
        System.out.println("Difference (ages): " + result);// Print the result

        // b. Create a new array of int called ages2 with 9 elements
        int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 12};

        // b.i. Subtract the first element from the last element in ages2
        int result2 = ages2[ages2.length - 1] - ages2[0];// Dynamic indexing works for arrays of any length
        System.out.println("Difference (ages2): " + result2);

        // c. Calculate the average in 'ages' array using a loop
        int sum = 0;
        for (int age : ages) {
            sum += age; // Accumulate the sum of all elements
        }
        double averageAge = (double) sum / ages.length;// Calculate the average
        System.out.println("Average age: " + averageAge);

        // 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length(); // Add the length of each name
        }
        double averageLetters = (double) totalLetters / names.length;// Calculate the average
        System.out.println("Average letters per name: " + averageLetters);

        // b. Concatenate all the names together separated by spaces
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");// Append each name followed by a space
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());// Print the result without trailing space

        // 3. Access the last element of 'names' array: array[array.length - 1]
        System.out.println("Last element in names: " + names[names.length - 1]);

        // 4. Access the first element of 'names' array: array[0]
        System.out.println("First element in names: " + names[0]);

        // 5. Create nameLengths array and add the length of each name
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();// Store the length of each name
        }

        // 6. Calculate the sum of all elements in nameLengths
        int nameLengthsSum = 0;
        for (int length : nameLengths) {
            nameLengthsSum += length;// Sum up the lengths
        }
        System.out.println("Sum of nameLengths: " + nameLengthsSum);

        // 7. Method to concatenate a word n times
        System.out.println(concatWordNTimes("Hello", 3));// Call method with "Hello" repeated 3 times

        // 8. Method to return full name
        System.out.println(createFullName("John", "Doe"));// Call method with "John" and "Doe"

        // 9. Method to check if sum of an int array is greater than 100
        System.out.println(isSumGreaterThan100(ages));// Prints true or false

        // 10. Method to calculate the average of a double array
        double[] exampleArray = {1.5, 2.5, 3.5};
        System.out.println("Average: " + calculateAverage(exampleArray));// Call method and print the average


        // 11. Compare averages of two arrays and return true if the first is greater
        double[] array1 = {5.0, 6.0, 7.0};
        double[] array2 = {2.0, 3.0, 4.0};
        System.out.println("Is first array's average greater? " + compareAverages(array1, array2));

        // 12. Method to decide to buy a drink
        System.out.println("Will buy drink? " + willBuyDrink(true, 11.0));// Check with given parameters

        // 13. Custom method: Calculate factorial
        System.out.println("Factorial of 5: " + calculateFactorial(5));/ Factorial of 5 = 5*4*3*2*1
    }
    }

    // 7. Concatenate word n times
    public static String concatWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);// Append the word repeatedly
        }
        return result.toString();
    }

    // 8. Return full name
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName; // Concatenate first and last name with a space
    }
    }

    // 9. Check if sum of an array is greater than 100
    public static boolean isSumGreaterThan100(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;// Sum all elements
        }
        return sum > 100;// Return true if sum is greater than 100
    }

    // 10. Calculate average of double array
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;// Sum all elements
        }
        return sum / arr.length;// Return the average
    }

    // 11. Compare averages of two arrays
    public static boolean compareAverages(double[] arr1, double[] arr2) {
        return calculateAverage(arr1) > calculateAverage(arr2);// Return true if first is greater
    }
    }

    // 12. Will buy drink?
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;// Return true if conditions are met
    }

    // 13. Custom method: Calculate factorial
    // This method calculates the factorial of a given number n
    public static int calculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;// Multiply each number up to n
        }
        return factorial;// Return the factorial result
    }
}