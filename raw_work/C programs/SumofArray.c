#include<stdio.h>

int main(void){
	int values[100], limit, sum;
	printf("Enter a array limit : \n");
	scanf("%d", &limit);
	printf("Enter a values : \n");
	for(int i = 0; i  < limit; i++){
		scanf("%d", &values[i]);
	}
		
	for(int i = 0; i < limit; i++){
		sum += values[i];
	}
		printf("sum = %d\n", sum);
}
