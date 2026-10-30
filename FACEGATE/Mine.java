import java.util.Scanner;
public class Mine{
      public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("How Many Student Do You Have: ");
      int student = input.nextInt();
      
      System.out.println("How Many Subject Do They Offer: ");
      int subject = input.nextInt();
      
      System.out.println("Saving >>>>>>>>>>>>>>>>>>");
      System.out.println("Saved Successfully");
      
      int[][] scores = new int[student][subject];
      
       for(int index = 0; index < student; index++){
            for(int count = 0; count < subject; count++){
            System.out.println("Scores for student " + (index + 1));
            System.out.print("Scores for subject " + (count + 1) + " : ");
            int score = input.nextInt();
            
            while(score < 0 || score > 100){
                  System.out.println("Invalid score");
                  score = input.nextInt();
            }
            scores[index][count] = score;
            System.out.println("Saving >>>>>>>>>>>>>");
            System.out.println("Saved Successfully");
            
            }
       }
       int[] total = new int[student];
       for(int count = 0; count < student; count++){
            int sum = 0;
            
            for(int index = 0; index < subject; index++){
                  sum += scores[count][index];
            }
            total[count] = sum;
       }
       
       int[] studentPosition = new int[student];
       for(int count = 0; count < student; count++){
            studentPosition[count] = 1;
            
            for(int index = 0; index < student; index++){
                  if(total[index] > total[count]){
                        studentPosition[count]++;
                  }
            }
       }
       
       
       System.out.println("=================== STUDENT RESULT ============================");
       System.out.printf("%12s", "STUDENT");
      for(int index = 0; index < subject; index++){
            System.out.printf("%8s", "SUBJECT" + (index + 1));
      }
      
      System.out.printf("%10s%10s%10s%n", "Total", "Average", "Position");
      System.out.println("================================================================");
      
      for(int count = 0; count < student; count++){
            double average = (double) total[count] / subject;
            System.out.printf("%12s", "STUDENT " + (count + 1));
            
            for(int index = 0; index < subject; index++){
                  System.out.printf("%8d", scores[count][index]);
            }
            System.out.printf("%10d%10.2f%10d%n", total[count],average,studentPosition[count]);
      }
      System.out.println("===============================================================");
      }
}
