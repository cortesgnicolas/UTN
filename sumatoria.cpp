#include <stdio.h>
#include <conio.h>
#include <math.h>
int main(){
	int min,max,sum=0;
	
	printf("Ingrese el valor minimo:\n");
	scanf("%d",&min);
	
	printf("Ingrese el valor maximo:\n");
	scanf("%d",&max);

	printf("%d", sum);
	while (sum < max){
		sum= sum + 1;
		printf("\nSumatoria: %d\n",sum);
	}
}
