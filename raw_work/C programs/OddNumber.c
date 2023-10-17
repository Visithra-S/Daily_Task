#include<stdio.h>

int main(void){
	int i,n;
	printf("Enter a number : ");
	scanf("%d" , &n);
	for(i = 1; i <= n; i++){
		if(i%3 == 0){
			printf("%d is a odd number.\n", i);
		}
	}
}
