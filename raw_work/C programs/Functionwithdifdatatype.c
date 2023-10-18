#include<stdio.h>

void sum(int, float);
int main(void){
	int a;
	float b;
	printf("Enter 2 numbers : ");
	scanf("%d%f", &a,&b);
	sum(a,b);
	return 0;
}

void sum(int num1, float num2){
	float result;
	result = num1 + num2;
	printf("result %f", result);
}
