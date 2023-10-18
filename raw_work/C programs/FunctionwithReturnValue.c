#include<stdio.h>

int sum(int, int);
int main(void){
	int a,b,c;
	printf("Enter a 2 numbers : \n");
	scanf("%d%d", &a,&b);
	c = sum(a,b);
	printf("result is : %d", c);
	return 0;
}

int sum(int num1, int num2){
	int result;
	result = num1 + num2;
	return result;
}
