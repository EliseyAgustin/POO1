/* Se desea desarrollar una aplicación para registrar los gastos a efectuar por los empleados de una empresa de un determinado departamento. 
El sector de Finanzas asigna un presupuesto anual a dicho departamento, con un monto en pesos asignado a cada mes, y permite que generen Gastos hasta ese monto de presupuesto, en cada mes.

De cada gasto de empleado se conocen los siguientes datos:

-Mes en el que se quiere efectuar el gasto (valor entero de 1 a 12).

-Monto del gasto (valor real)

Armar un menú con las siguientes opciones. Hacer una función menú que despliegue las opciones, 
Ingrese la opción elegida por teclado y devuelva el valor al programa principal.

-Opción 1 - Ingresar presupuesto de cada mes:

En esta opción, se deberá llamar a una función para cargar los montos en pesos de presupuesto de cada mes por teclado.  
Sugerencia: utilizar para guardar dicha información un vector de 12 posiciones reales, donde la posición 0 tendrá el presupuesto del mes 1 y así sucesivamente.

-Opción 2 - Ingresar gastos a efectuar por los empleados:

En esta opción, se deberán ingresar los datos de un gasto a efectuar por un empleado por teclado.

Luego deberá llamar a una función que tendrá como parámetros los datos de un gasto y el vector que se cargó en la opción 1 y deberá hacer las siguientes operaciones:

Si hay presupuesto suficiente para afrontar la totalidad del gasto en el mes solicitado, deberá actualizar el presupuesto deduciendo dicho gasto e informar por pantalla un cartel indicando "Gasto aprobado", el monto del gasto, el mes en que se efectuara dicho gasto y el monto de presupuesto restante.

Si no hay presupuesto suficiente para afrontar el gasto en el mes solicitado mostrar un cartel "Gasto rechazado".

-Opción 3 - Mostrar el presupuesto que quedó sin utilizar.

En esta opción deberá mostrar en el main, el vector de presupuesto cargado y actualizado en las opciones 1 y 2 respectivamente, mes a mes.

-Opción 4 - Salir 

Diseñar un algoritmo en Lenguaje C. Utilizar aritmética de punteros para el manejo de los vectores de las funciones de opciones 1 y 2. 
No utilizar variables globales */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <locale.h>
#define meses 12

int menu ();
void funcion1 (int, int*, int);
void funcion2 (int, int, int*);

int main (){
	int menuopcion;
	int i=0;
	int montomes;
	int vmeses[meses];
	int mesgasto;
	int gasto;
    int j=0;
    int p=0;
    int montototal;
    setlocale(LC_CTYPE,"spanish");
	
	do{
		menuopcion=menu();
		 
		    switch (menuopcion){
		 	
		 	     case 1:
		 		 for (i=0;i<meses;i++){
		 		 j++;
		 		 printf ("Ingrese el monto del mes: %i\n",j);
		 		 scanf ("%i",&montomes);
		 		 funcion1 (montomes,vmeses,i);
		 	     }
		 		 break;
		         case 2:
		 		 printf ("\nIngrese mes: ");
		 		 scanf ("%i",&mesgasto);
		 		 printf ("\ningrese monto del gasto: ");
		 		 scanf ("%i",&gasto);
		 		 funcion2 (mesgasto,gasto,vmeses);
		 		 break;
		         case 3:
			     for (i=0;i<meses;i++){
			 	 montototal= (*(vmeses+i))+montototal;
			 	 p++;
			 	 printf ("El mes %i = %i\n",p ,(*(vmeses+i)));
			     }
			 	 printf ("El presupuesto total de los meses es de: %i",montototal);
			 	 break;
			 	 case 4:
				 system("cls");
		    	 break;
		    	 default:
		    	 printf("La opcion es invalida"); 
		 	     break;
		}
	} while (menuopcion!=4);
}

int menu (){
	
	int opcion;
	system("color 02");
	printf ("\n||\t     Sector Finanzas    ||\t");
	printf("\n\t\tMENU\t");
	printf("\nOpcion 1- Ingresar presupuesto de cada mes");
	printf("\nOpcion 2- Ingresar gastos a efectuar por los empleados");
	printf("\nOpcion 3- Mostrar el presupuesto que quedó sin utilizar");
	printf("\nOpcion 4- Salir\n");
	scanf("%d",&opcion);
	return opcion;
}

 void funcion1 (int montomes, int *vmeses, int i){
	(*(vmeses+i))=montomes;
}

 void funcion2 (int mesgasto, int gasto, int *vmeses){
	int resultado;
	
	if (*(vmeses+mesgasto-1)>=gasto){
		printf ("\nGASTO APROBADO");
		resultado=(*(vmeses+mesgasto-1)-gasto);
		(*(vmeses+mesgasto-1)=resultado);
		printf ("\nEl monto de gasto es de: %i",gasto);
		printf ("\nEl mes del gasto es: %i",mesgasto);
		printf ("\nEl monto del mes actual es de: %i" ,resultado);
		}
	else {
	printf ("Gasto rechazado");
}
	
	
}

