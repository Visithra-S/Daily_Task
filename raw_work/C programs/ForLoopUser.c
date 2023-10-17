#include<stdio.h>

int main(void){
	int i,sum=0,n;
	printf("Enter a number: ");
	scanf("%d", &n);
	for(i = 1; i <= n ; i ++){
		sum += i;
	}
	printf("Sum = %d\n", sum);
}
