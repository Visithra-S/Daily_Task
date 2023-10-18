#include<stdio.h>

int main(void){
	
	int a[100];
	int limit;
	printf("Enter a Array limit : ");
	scanf("%d", &limit);
	
	printf("Enter a value :\n");
	
	for(int i = 0; i < limit; i++){
		scanf("%d", &a[i]);
		}
	printf("Entered values are : \n");
	
	for(int i = 0; i < limit; i++){
		printf("%d\n", a[i]);
		}
}
