#include<stdio.h>

int main(void){
	char firstname[15];
	char lastname[15];
	printf("Enter a FirstName : ");
	scanf("%s", firstname);
	
	printf("Enter a LastName : ");
	scanf("%s", lastname);
	
	printf("Your name is %s%s\n ",firstname,lastname); 
}
