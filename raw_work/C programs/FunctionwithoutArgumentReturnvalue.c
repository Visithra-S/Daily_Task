#include<stdio.h>

int sum();
int main(void){
	int k;
	k = sum();
	printf("%d", k);
	return 0;
}

int sum(){
	int a,b,c;
	printf("Enter 2 numbers : ");
	scanf("%d%d", &a,&b);
	c= a + b;
	return c;
}
