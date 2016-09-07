import java.util.Scanner;

//thi sis a java class
public class Average {

  //this is the main method
  //where the application starts
  public static void main(String[] args){
    //thi sis a data type
    
    /*int x = 3;
    double number = 3.0;
    String word = "Hi Saron"
    char letter = 'x'
    */
    
    Scanner input = new Scanner(System.in);
    
    //prompt the user
    System.out.println("Enter 3 numbers: ");
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();
    
    double average = (num1 + num2 + num3)/3;
    
    System.out.println("This is the average" + average);
    
  }
  
}