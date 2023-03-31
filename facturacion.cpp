#include <stdio.h>
#include <conio.h>
#include <math.h>
int main(){
	int lineas,precio,cant,c=1,total=0,parcial=0;
	printf("Ingrese la cantidad de lineas que tiene su factura:\n");
	scanf("%d",&lineas);
	while (c<=lineas){
		printf("Ingrese el precio de el valor de su producto:\n");
		scanf("%d",&precio);
		printf("Ingrese la cantidad de productos\n");
		scanf("%d",&cant);
		parcial=precio * cant;
		printf("Precio parcial: $%d\n",parcial);
		total = total + parcial;
		c++;
	}
	printf("El total es d: $%d",total);
	return 0;
}
