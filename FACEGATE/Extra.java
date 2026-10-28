public class Extra{
public static void main(String[] args){
	
int [][] numbers = {
			 {1, 2, 3},
			 {4, 5, 6},
			 {7, 8, 9},
	
	
			};
				
for(int rows = 0; rows < numbers.length; rows++){
	for(int counter = 0; counter < numbers[rows].length; counter++){		
		for(int index = counter + 1; index < numbers[rows].length; index++){
			if(numbers[rows][counter] < numbers[rows][index]){
				int swap = numbers[rows][counter];
				numbers[rows][counter] = numbers[rows][index];
				numbers[rows][index] = swap;
			}
		}
	}
}
	for(int counter = 0; counter < numbers.length; counter++){
		for(int index = 0; index < numbers[counter].length; index++){
		System.out.print(numbers[counter][index] + " , ");
			}
		System.out.println();
		}
	
}
}
