#include<stdio.h>

int main(void){
	float num1,num2,num3,average;
	printf("Enter a three Numbers :\n");
	scanf("%f%f%f", &num1,&num2,&num3);
	average = (num1+num2+num3)/3;
	printf("Average value is %f" , average);
}
