#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <locale.h>

void carga(char , int , int , char* , int* , int* , int);
void informe(char*, int*, int*, int );
int opciones();

int main(){
	char dest, vdest[50];
	int i=0, menu, c_psjes, p_bdas, vpsjes[50], vbdas[50];
	setlocale (LC_CTYPE,"spanish");
	
	do{
		menu=opciones ();
	
		switch(menu){
		         case 1:
				 printf("Ingrese su destino: 'F' Fin de Año en BS.AS , 'R' Rio, 'M' Montevideo: ");
				 scanf("%s",&dest);
				 fflush(stdin);
				 printf("Ingrese la cantidad de pasajes: ");
				 scanf("%i",&c_psjes);
				 fflush(stdin);	
				 printf("Ingrese si va a incluir pack de bebidas: 1=Si, 0=No: ");
				 scanf("%i",&p_bdas);
				 carga(dest, c_psjes, p_bdas, vdest, vpsjes, vbdas, i);
				 i++;
			     break;
			     case 2:
				 informe(vdest, vpsjes, vbdas, i);
			     break;
			     case 3:
				system("cls");
				break;
				default:
				printf("La opcion es invalida");
				break;
	}

	}	while(menu!=3);

}
int opciones (){
 
		int menu;
		system ("color 02");
		printf("\n||\t      NAVIERA\t    ||");
	    printf("\n\t\tMENU\n");
		printf("\nOpcion 1: Ingresar solicitudes de pasajes");
		printf("\nOpcion 2: Informar costos del viaje");
		printf("\nOpcion 3: Salir\n");
		scanf("%d",&menu);
		system ("cls");
		return menu;
} 

void carga (char dest, int c_psjes, int p_bdas, char *vdest, int *vpsjes, int *vbdas, int i)
{
*(vdest+i)=dest;
*(vpsjes+i)=c_psjes;
*(vbdas+i)=p_bdas;
fflush(stdin);	
}
void informe(char *vdest, int *vpsjes, int *vbdas, int i){
   int contf=0,contr=0,contm=0,adi1=0,adi2=0,adi3=0,resul1=0,resul2=0,resul3=0;
	int j;
		
		for (j=0;j<i;j++)
		{
			switch (*(vdest+j))
			{
				case 'f':
						contf++;
						resul1=*(vpsjes+j)*2240;
							if (*(vbdas+j)==1)
							{
								adi1=*(vpsjes+j)*300;
							}
				break;
				case 'r':
						contr++;
						resul2=*(vpsjes+j)*908;
							if (*(vbdas+j)==1)
							{
								adi2=*(vpsjes+j)*300;
							}
				break;
				case 'm':
						contm++;
						resul3=*(vpsjes+j)*1240;
							if (*(vbdas+j)==1)
							{
								adi3=*(vpsjes+j)*300;
							}
				break;
			}
		}
	
	printf ("\n--------------------------------------------------------------------------------\n");
	printf ("\nCantidad de 8 Noches Crucero Fin de Año desde Bs As: %i\n",contf);
	printf ("\nPrecio: $%i\n",resul1);
	printf ("\nCosto adicional si solicito pack bebidas: $%i\n",adi1);
	printf ("\n------------------------------------------------------------------------------\n");
	printf ("\nCantidad de 8 noches Rio de Janeiro, Buzios, Ihlabela desde Bs As: %i\n",contr);
	printf ("\nPrecio: $%i\n",resul2);
	printf ("\nCosto adicional si solicito pack bebidas: $%i\n",adi2);
	printf ("\n--------------------------------------------------------------------------------\n");
	printf ("\nCantidad de 8 Noches Rio de Janeiro, Montevideo desde Bs As : %i\n",contm);
	printf ("\nPrecio: $%i\n",resul3);
	printf ("\nCosto adicional si solicito pack bebidas: $%i\n",adi3);
	printf ("\n--------------------------------------------------------------------------------\n");
	
}

