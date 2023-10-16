#include<stdio.h>

int main(void){
	int num;
	printf("Enter a number : \n");
	scanf("%d", &num);
	if(num<0){
		printf("your entered number is negative.....");
	}else{
		printf("your entered number is positive.....");
	}
}
