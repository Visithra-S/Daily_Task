#include<stdio.h>

int main(void){
	int values[100], limit, i, j, temp;
	
	printf("Enter a array limit : \n");
	scanf("%d", &limit);
	
	printf("Enter a values : \n");
	
	for(i = 0; i  < limit; i++){
		scanf("%d", &values[i]);
	}
	
	for(i = 0; i < limit-1; i++){
		for(j = i+1; j < limit; j++){
			if(values[i] > values[j]){
				temp = values[i];
				values[i] = values[j];
				values[j] = temp;
			}
		}
	}
	printf("Sorted array values : \n");
	
	for(i = 0; i < limit; i++){
			printf("%d\n", values[i]);
	}
}
