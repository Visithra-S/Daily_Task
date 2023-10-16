#include<stdio.h>

int main(void){
	int choice;
	printf("Enter a number :\n");
	scanf("%d", &choice);
	switch(choice){
		case 1:
			printf("your selected dosa.\n");
			break;
		case 2:
			printf("your selected parota.\n");
			break;
		case 3:
			printf("your selected briyani.\n");
			break;
		case 4:
			printf("your selected panipuri.\n");
			break;
		default:
			printf("your entered invalid number.\n");
	}
}
