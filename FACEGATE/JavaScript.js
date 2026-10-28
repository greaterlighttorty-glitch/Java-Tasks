function Sorting(numbers){
	
	for(let rows = 0; rows < numbers.length; rows++){
		for(let column = 0; column < numbers[rows].length; column++){
			for (let index = column + 1; index < numbers[rows].length; index++){
			
				let swap = numbers[rows][column];
				numbers[rows][column] = numbers[rows][index];
				numbers[rows][index] = swap;
				
				
			
			}
		
		
		}
	
	  }
	return numbers;

  }

		
	let numbers = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
	

	
		let total = Sorting(numbers);
		console.log(total);
