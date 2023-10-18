#include<stdio.h>

int main(void){
	int values[100], limit, searchkey, flag = 0, i;
	
	printf("Enter a array limit : \n");
	scanf("%d", &limit);
	
	printf("Enter a values : \n");
	
	for(i = 0; i  < limit; i++){
		scanf("%d", &values[i]);
	}
	
	printf("Enter a Search key : ");
	scanf("%d", &searchkey);
		
	for(i = 0; i < limit; i++){
		if(searchkey == values[i]){
			flag = 1;
			break;
		}
	}
	if(flag==1){
		printf("value found at position %d\n",i+1);
	}else{
		printf("Value not found.");
	}
}
