#include<stdio.h>

int main(void){
	int Number1,Number2,Number3;
	printf("Enter a Number :\n ");
	scanf("%d%d%d", &Number1, &Number2, &Number3);
	if(Number1<Number2){
		printf("Greatest Number is :%d",Number1);
	}else if(Number2<Number3){
		printf("Greatest Number is :%d",Number2);
	}else if(Number3<Number1){
		printf("Greatest Number is :%d",Number3);
	}else{
		printf("Invalid Number");
	}
}
