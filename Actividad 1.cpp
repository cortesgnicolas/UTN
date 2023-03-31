#include <stdio.h>
#include <conio.h>

int main(){
	int d,total=0,min=600,max=0,c=0;
	float prom;
	while (c < 7){
		printf("Ingrese la cantidad de agua caida día por día \n");
		scanf("%i",&d);
		total= total + d;
		c++;
		if (d > max){
			max = c;
		}
		if (d < min){
			min = c;
		}
	}
	prom=total/7;
	printf("El promedio de agua caida es %.2f mm \n", prom);
	printf("El dia de mayor agua fue: El dia %d\n", max);
	printf("El dia d menor agua fue: El dia %d\n",min);
	getch();
	return 0;
}
