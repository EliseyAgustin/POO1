#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <locale.h>

void carga(char , int , int , int*, int*, char*, int);
void informe(int*, int*, char*, int);
int opciones();

int main(){
	char v_frcte, vv_frcte[50];
	int i=0, menu, dni, c_dest, vdni[50], vc_dest[50];
	setlocale (LC_CTYPE,"spanish");
	
	do{
		menu=opciones();
		
		switch(menu){
			case 1:
			printf("Ingrese Codigo del destino: 1=Iguazú, 2=Córdoba, 3=Mendoza o 4=Ushuaia: ");
			scanf("%i",&c_dest);
			printf("Ingrese DNI del pasajero: ");
			scanf("%i",&dni);
			printf("Ingrese si es viajero frecuente: 'S', 'N': ");
			scanf("%s",&v_frcte);
			carga(v_frcte, dni, c_dest, vdni, vc_dest, vv_frcte, i);
			i++;
			break;
			case 2:
			informe(vdni, vc_dest, vv_frcte, i);
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
system ("color 02");
printf("\n||\t     AEROPUERTO EZEIZA\t    ||");
printf("\n\t\tMENU\n");
printf("\nOpcion 1: Cargar reservas de pasajes aéreos");
printf("\nOpcion 2: Emitir pasajes aéreos");
printf("\nOpcion 3: Salir");
scanf("%d",&menu);
system("cls");
return menu;
}

void carga(char v_frcte, int dni, int c_dest, int *vdni, int *vc_dest, char *vv_frcte, int i)
{
*(vv_frcte+i)=v_frcte;
*(vdni+i)=dni;
*(vc_dest+i)=c_dest;
}

void informe(int *vdni, int *vc_dest, char *vv_frcte, int i)
{
	int conti=0, contc=0, contm=0, contu=0, resul1=0, resul2=0, resul3=0, resul4=0, desc1=0, desc2=0, desc3=0, desc4=0;
	int j;
	
	for (j=0;j<i;j++){
		
		switch (*(vv_frcte+j))
			{
				case 'i':
						conti++; 
						resul1=*(vc_dest+j)*5000; 
							if (*(vv_frcte+j)==1)
							{
								desc1=*(vc_dest+j)-15; 
							}
				break;
				case 'c':
						contc++;
						resul2=*(vc_dest+j)*2000;
							if (*(vv_frcte+j)==1)
							{
								desc2=*(vc_dest+j)-15;
							}
				break;
				case 'm':
						contm++;
						resul3=*(vc_dest+j)*3500;
							if (*(vv_frcte+j)==1)
							{
								desc3=*(vc_dest+j)-15;
							}
				break;
					case 'u':
						contu++;
						resul3=*(vc_dest+j)*10000;
							if (*(vv_frcte+j)==1)
							{
								desc4=*(vc_dest+j)-15;
							}
			}
		}
	printf("\n------------------------------------------------------------");
	printf("\nSu DNI es: %i y el costo de su pasaje a Iguazu es: %i", resul1);
	printf("\nLa cantidad de pasajes aereos emitidos hacia Iguazu son: %i",conti);
    printf("\n------------------------------------------------------------");
    printf("\nSu DNI es: %i y el costo de su pasaje a Cordoba es: %i", resul2);
    printf("\nLa cantidad de pasajes aereos emitidos hacia Cordoba son: %i",contc);
    printf("\n------------------------------------------------------------");
    printf("\nSu DNI es: %i y el costo de su pasaje a Mendoza es: %i", resul3);
    printf("\nLa cantidad de pasajes aereos emitidos hacia Mendoza son: %i",contm);
    printf("\n------------------------------------------------------------");
    printf("\nSu DNI es: %i y el costo de su pasaje a Ushuaia es: %i", resul4);
    printf("\nLa cantidad de pasajes aereos emitidos hacia Ushuaia son: %i",contu);
    printf("\n-------------------------------------------------------------");
}



