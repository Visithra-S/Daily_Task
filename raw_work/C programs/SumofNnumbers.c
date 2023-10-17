#include<stdio.h>

int main(void){
	int number,sum=0;
	printf("Enter a number : ");
	scanf("%d", &number);
	for(int i = 1; i < = number; i++){
		sum +=i;
	}
	printf("sum = %d\n", sum);
}
