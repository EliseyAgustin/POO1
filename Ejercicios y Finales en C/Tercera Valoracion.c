#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define tam 50

void carga(int, int, int, int, int*, int*, int*);
void informe(int, int*, int*, int*);

int main(){
	char T_ART;
	int i, resp, cod_art, cant_clientes, ttal_facturado;
	int cod_Art[50], cant_cltes[50], t_fact[50];
	float imp_c;
	for(i=0;i<50;i++)
	     cod_Art[i]=0;
	 do{
	    printf("\n||\t      PERFUMERIA\t    ||");
	    printf("\n\t\tMENU\n");
	    printf("\nOpcion 1: Ingresar datos de la venta");
	    printf("\nOpcion 2: Generar informes del dia");
	    printf("\nOpcion 3: SALIR\n");
	    fflush(stdin);
	    scanf("%i", &resp);
	    system("cls");
	    switch(resp){
		case 1:
			system("cls");
			printf("\nIngrese el codigo del articulo 'a'=Algodon 'c'=Curitas: ");
			scanf("%s",&T_ART);
			printf("\nIngrese el importe a cobrar: ");
			scanf("%f",&imp_c);
			carga(cod_art, cant_clientes, ttal_facturado, imp_c, cod_Art, cant_cltes, t_fact);
			break;
		case 2:
			informe(cod_art, cod_Art, cant_cltes, t_fact);
			break;
		case 3:
			system("cls");
			break;
			default:
			printf("Error de eleccion");
			break;
			
			}
	    }
	    while(resp!=3);
    }
    
void carga(int cod_art, int cant_clientes, int ttal_facturado, int imp_c, int *cod_Art, int *cant_cltes, int *t_fact){
int i=0;
while(i<50 && *(cant_cltes+i)!=0)
	       i++;
	if(i==50)
	{  
	    printf("No se puede agregar mas valores");  
		 }	 
	else
	{
	*(cod_Art+i)=cod_art;
	*(cant_cltes+i)=cant_clientes;
	*(t_fact+i)=imp_c;
	}

}
	
void informe(int cod_art, int *cod_Art, int *cant_cltes, int *t_fact){
int j=0, cant_cA=0, cant_cC=0, vent_t=0, vent_c=0;
    printf("\n------------------------");
	printf("\nCant.Cliente Imp.Compra ");
	printf("\n------------------------");

while (*(cant_cltes+j)!=0 && j<50)
	{
	       if (*(cant_cltes+j))
	       {
		    switch (*(cod_Art+j))
		    {
			case 'A':
				     cant_cA=cant_cA+*(cant_cltes+j);
				     break;
			case 'C':
				     cant_cC=cant_cC+*(cant_cltes+j);
				     break;
			case 'V':
				     vent_t=vent_t+*(t_fact+j);
				     break;
			case 'D':
				     vent_c=vent_c+*(cant_cltes+j);
				     break;
				     }
		    printf("\n%9d %8d %6d",*(cant_cltes+j));
		    j++;
		  } 
	}
	
	printf("\nEl informe es: ");
	printf("\nLa cantidad de clientes que compraron algodon es: %i y curitas: %i",cant_cA,cant_cC);
	printf("\nEl dinero generado por las ventas totales: %i",vent_t);
	printf("\nEl dinero generado por las ventas de curitas es: %i",vent_c);
}
