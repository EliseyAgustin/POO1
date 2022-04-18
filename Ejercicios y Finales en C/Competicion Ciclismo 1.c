/*Se desea desarrollar una aplicaci�n para registrar los datos de una Competici�n de ciclismo. En la competici�n hay pruebas de dos tipos: Persecuci�n y Velocidad.
De cada participante, de cada tipo de prueba en la que particip�, se conocen los siguientes datos:
N�mero de DNI del participante (valor entero)
Tipo de prueba en la que particip� (valor char 'p'=persecuci�n', �v�=velocidad)
Posici�n en la que lleg� en ese tipo de prueba (valor entero)
En la Competici�n de ciclismo puede haber varias pruebas de persecuci�n y varias de velocidad.
Armar un men� con las siguientes opciones:

Opci�n 1 - Ingresar datos de participantes de la Competici�n:
En esta opci�n, se deber�n ingresar los datos de un participante en un determinado tipo de prueba por teclado. Luego, deber� calcular el puntaje obtenido del participante teniendo en cuenta la siguiente informaci�n:
Posici�n           Puntaje
1                      50                                                       
2                      20                                                       
3                      10                                           
M�s de 3                0                                             

Luego, deber� llamar a una funci�n que tenga como par�metros los datos ingresados por teclado y el puntaje obtenido y 4 vectores, y guarde dichos datos en los 4 vectores respectivamente.

Opci�n 2 - Generar informe de la Competici�n:
En esta opci�n, se deber� llamar a una funci�n que tenga como par�metros los 4  vectores cargados en la opci�n 1, y los utilice para informar:
a)El N�mero de DNI de los ciclistas que llegaron en la posici�n 1 en la Competici�n, en cualquier tipo de prueba.
b)El puntaje total obtenido por cada tipo de prueba.

Opci�n 3 - Salir
Dise�ar un algoritmo en Lenguaje C. Evitar el uso de variables globales. Estimar el tama�o de los vectores en 50 posiciones. Usar aritm�tica de punteros para el manejo de vectores en las funciones de opci�n 1 y 2*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

void carga(int, int, int, char, int*, int*, int*, char*, int);
void informe(int*, int*, int*, char*, int);
int opciones ();

int main (){
	int menu;
	int tipo;
	int dni, vdni[50];
	int j=0;
	int posicion, vposicion[50];
	int puntaje, vpuntaje[50];
	char tprueba, vtprueba[50];
	setlocale (LC_CTYPE,"spanish");

do{
	menu=opciones ();
	
	switch(menu){
		case 1:
		printf("\nIngrese su numero de DNI: ");
		scanf("%d",&dni);
		printf ("\nIngrese al tipo de prueba que participo: 'p'=persecuci�n', �v�=velocidad: ");
		scanf("%s",&tipo);
		switch(tipo){
					 case 'p':tipo=1;
					 break;
					 case 'v':tipo=2;
					}
					printf ("\nIngrese la posicion que llego en la prueba: ");
					scanf("%d",&posicion);
					switch(posicion)
					{
		case 1:
		printf ("\nSu puntaje es [50]");
		puntaje=50;
		break;
		case 2:
		printf ("\nSu puntaje es [20]");
		puntaje=20;
		break;
		case 3:
		printf ("\nSu puntaje es [10]");
		puntaje=10;
		break;
		default:
		printf ("\nNo alcanzaste los puntos necesarios");
		break;
		}
		carga (dni, posicion, tprueba, puntaje, vdni, vposicion, vpuntaje,  vtprueba, j);
		j++;
	    break;
		case 2:
		informe(vdni, vposicion, vpuntaje, vtprueba, j);
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
system ("color 04");
printf("\n||\t     PROGRAMA DE REGISTRO: COMPETICION DE CICLISMO\t    ||");
printf("\n\t\tMENU\n");
printf("\nOpcion 1: Ingresar datos de participantes de la Competici�n");
printf("\nOpcion 2: Generar informe de la Competici�n");
printf("\nOpcion 3: Salir");
scanf("%d",&menu);
system("cls");
return menu;
}

void carga(int dni, int posicion, int puntaje, char tprueba, int *vdni, int *vposicion,int *vpuntaje, char *vtprueba, int j){
	*(vdni+j)=dni;
	*(vposicion+j)=posicion;
	*(vtprueba+j)=tprueba;
	*(vpuntaje+j)=puntaje;
}

void informe(int *vdni, int *vposicion,int *vpuntaje, char *vtprueba, int j){
	int q,acum1=0,acum2=0;
	
	for(q=0;q<j;q++)
	{
		if (*(vposicion+q)==1){
			printf ("El numero de DNI de los ciclistas en el primer lugar: [%i]\n",*(vdni+q));
		}
		if (*(vpuntaje+q)==1){
			acum1+=*(vpuntaje+q);
		}else {
			acum2+=*(vpuntaje+q);
		}
	}
	printf ("Si desea observar el puntaje total obtenido por prueba presione ENTER\n");
	system("pause");
	system("cls");
	
	printf ("El puntaje total de la prueba persecucion [%i]\n",acum1);
	printf ("El puntaje total de la prueba velocidad [%i]\n",acum2);
	
	system("pause");
	system("cls");
}


