#include<stdio.h>

int main(void){
	float length,width,area;
	printf("Enter the area of the length : ");
	scanf("%f", &length);
	printf("Enter the are of the width : ");
	scanf("%f", &width);
	area = length*width;
	printf("area = %f\n :", area);
}
