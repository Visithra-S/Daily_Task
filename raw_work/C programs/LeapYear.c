#include<stdio.h>

int main(void){
	int year;
	printf("Enter a year : ");
	scanf("%d", &year);
	if(year%4 == 0){
		if(year%100 == 0){
			if(year%400 == 0){
				printf("centuries leap year.");
		}else{
			printf("centuries non leap year.");
		}
			}
		printf("%d is a leap year", year);
	}else{
		printf("%d is a non leap year", year);
	}

}
