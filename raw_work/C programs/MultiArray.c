#include<stdio.h>

int main(void){
	
	int value[3][3],i,j;
	
	printf("Enter a values : \n");
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
			scanf("%d", &value[i][j]);
		}
	}
	for(i = 0; i < 3; i++){
		for(j = 0; j < 3; j++){
	printf("%d ", value[i][j]);	
		}
		printf("\n");
	}
}
