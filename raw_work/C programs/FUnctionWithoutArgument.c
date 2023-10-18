#include<stdio.h>

void sum();//function declation
int main(void){//function executing point
	
	sum();
	sum();
	
	return 0;
}

void sum(){//function without argument
	int num1,num2,sum;//function definition
	printf("Enter a 2 numbers : \n");
	scanf("%d%d", &num1,&num2);
	sum = num1 + num2;
	printf("sum = %d\n", sum);
}
