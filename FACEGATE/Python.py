def list_sort(numbers):
	result = []
	for rows in range(len(numbers)):
		columns = []
		for index in range(len(numbers[rows])):
			columns.append(numbers[rows][(len(numbers[rows])) - 1- index])
		result.append(columns)
	return result


print (list_sort([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))
