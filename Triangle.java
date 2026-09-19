import java.util.Scanner;
 public class Triangle{
  public static void main(String[] args){
 
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a length: ");

  double length = input.nextDouble();
  double area = (Math.sqrt(3)/4)*length * length;
  double volume = area * length;

  System.out.println("The area is" + area);
  System.out.println("The volume of the Triangle prism is + volume");

}
}
