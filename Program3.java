//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
    class Program3 {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            
            int length = 0;
            int width = 0;
            int area = 0;
            int perimeter = 0;
            
            
            
            //Ask for user input
            System.out.println("Please enter length:");
            length=myScanner.nextInt();
            
            System.out.println("Please enter width:");
            width=myScanner.nextInt();
            
            //Get input
            
            
            //Calculate
            area = 0; //Actually calc here
            perimeter = 0; //Actually calc here
            //Output
            System.out.println("The length is:" + length);
            System.out.println("The width is:" + width);
            System.out.println("The area is:" + area);
            System.out.println("The perimeter is:" + perimeter);
        }
    }



//Paste console output below:
/*


*/
