#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

void carga(char , int , int , int , char*, int*, int*, int *, int);
void informe(char*, int*, int*, int*, int);
int opciones();

int main(){
	char turno, vturno[50];
	int i=0, menu, cod_e, cod_s, tipo;
	int vcod_e[50], vcod_s[50], vtipo[50];
	setlocale (LC_CTYPE,"spanish");
	
	do{
		menu=opciones();
		
		switch(menu){
			case 1:
			printf("Ingrese Codigo de empleado: ");
			scanf("%i",&cod_e);
			fflush(stdin);
			printf("Ingrese Codigo de la sucursal: '1', '2', '3', '4': ");
			scanf("%i",&cod_s);
			fflush(stdin);
			printf("Ingrese 1=Entrada, 2=Salida: ");
			scanf("%i",&tipo);
			fflush(stdin);
			printf("Ingrese el turno: 'm'=Mañana, 't'=Tarde, 'n'=Noche: ");
			scanf("%s",&turno);
			carga(turno, cod_e, cod_s, tipo, vturno, vcod_e, vcod_s, vtipo, i);
			i++;
			break;
			case 2:
			informe(vturno, vcod_e, vcod_s, vtipo, i);
			break;
			case 3:
			system("cls");
			break;
			default:
			printf("La opcion es invalida");
			break;
		}
	} while(menu!=3);
	
}
int opciones(){
	
	int menu;
	system("color 02");
	printf("\n||\t     FARMACIA\t    ||");
	printf("\n\t\tMENU\n");
	printf("\nOpcion 1: Ingresar Datos de Fichaje");
	printf("\nOpcion 2: Generar informe de Fichajes");
	printf("\nOpcion 3: Salir");
	scanf("%d",&menu);
	system("cls");
	return menu;
}
void carga(char turno, int cod_e, int cod_s, int tipo, char *vturno, int *vcod_e, int *vcod_s, int *vtipo, int i)
{
*(vturno+i)=turno;
*(vcod_e+i)=cod_e;
*(vcod_s+i)=cod_s;
*(vtipo+i)=tipo;
}
void informe(char *vturno, int *vcod_e, int *vcod_s, int *vtipo, int i){
	int contS1=0, contS2=0, contS3=0, contS4=0, acum1=0, acum2=0, acum3=0, acum4=0, contE=0, contS=0; 
	int j;
	
	for(j=0;j<i;j++)
	{
		switch (*(vturno+j))
		{
			case 'a':
				     contS1++;
				     acum1=acum1+*(vcod_s+j);
				     break;
			case 'b':
				     contS2++;
                     acum2=acum2+*(vcod_e+j);
                     if (*(vtipo+j)==1){
				     contE++;
					 }
					 else{
					 contS++;
					 }
                     break;
			case 'c':
				     contS3++;
				     acum3=acum3+*(vcod_s+j);
				     break;
			case 'd':
				     contS4++;
				     acum4=acum4+*(vcod_s+j);
				     break;
			}
    } 
printf("\n---------------------------------------------------------------------------------");
printf("\nLa cantidad de empleados que ficharon de la sucursal 1 son: %i",contS1);
printf("\n---------------------------------------------------------------------------------");
printf("\nLa cantidad de empleados que ficharon de la sucursal 2 son: %i",contS2);
printf("\nLa cantidad de empleados que entraron son: %i y los que salieron: %i",contE, contS);
printf("\n---------------------------------------------------------------------------------");
printf("\nLa cantidad de empleados que ficharon de la sucursal 3 son: %i",contS3);
printf("\n---------------------------------------------------------------------------------");
printf("\nLa cantidad de empleados que ficharon de la sucursal 4 son: %i",contS4);
printf("\n---------------------------------------------------------------------------------");
}


