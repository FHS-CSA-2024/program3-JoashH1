

import java.util.Scanner; public class RectangleCalculator 
{ 
    public static void main(String[] args)
{ 
// Create a Scanner object to take input from the user 
Scanner scanner = new Scanner(System.in); 
// Prompt the user for the length and width of the rectangle 
System.out.print("Enter the length of the rectangle: "); 
    double length = scanner.nextDouble(); 
    System.out.print("Enter the width of the rectangle: "); 
    double width = scanner.nextDouble(); 
// Calculate the area and perimeter 
    double area = length * width; double perimeter = 2 * (length + width); 
// Output the results 
    System.out.println("Area of the rectangle: " + area); 
    System.out.println("Perimeter of the rectangle: " + perimeter); 
    // Close the scanner 
    scanner.close(); } }



//Paste console output below:
/*


*/
