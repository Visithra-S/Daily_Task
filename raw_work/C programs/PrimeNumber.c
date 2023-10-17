#include<stdio.h>

int main(void){
	int n,flag=0;
	printf("Enter a Number : ");
	scanf("%d", &n);
	for(int i = 2; i <= n/2; i++){
		if(n%i == 0){
			flag++;
			break;
		}
	}
	if(flag == 0){
		printf("%d is a PrimeNumber.\n" , n);
	}else{
		printf("%d is a Non-Prime Number.\n" , n);
	}
}
