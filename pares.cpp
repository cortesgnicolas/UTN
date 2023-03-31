#include <stdio.h>
#include <conio.h>
#include <math.h>
int main(){
	int n=50,tot=0;
	while (n>=20){
	
		if(n%2 == 0){
			tot= tot+1;
			printf("%d\n",n);
		}
		
		n--;
	}
	printf("La cantidad de numeros pares es: %d\n",tot);
	
}
