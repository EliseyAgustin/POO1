#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <conio.h>
#include <string.h>
#include <locale.h>
#define v 50 

void informar(int*,int*,int*,int*,int);
void pasa(int,int,int,int,int*,int*,int*,int*,int);
int menu();
int main()
{
	char tipo,consulta,consulta1;
	int x,cantidad,tip,con,con1,vcantidad[v]={0},vtip[v]={0},vcon[v]={0},vcon1[v]={0},j=0;
	(LC_CTYPE,"spanish");
	x=menu();
	do
	{
		switch(x)
		{
			case 1:
				printf ("Ingrese si es 'e'=Estudiante, 'g'=Graduado\n");
				scanf("%c",&tipo);
				fflush(stdin);
				switch(tipo)
				{
					case 'e':tip=1;
					break;
					case 'g':tip=2;
					break;
				}
				printf ("Cantidad de libros que tiene en su casa:\n1=Entre 0 y 20 \n2=entre 21 y 50 \n3=entre 51 y 100 \n4=más de 100\n");
				scanf("%d",&cantidad);
				fflush(stdin);
				printf ("Consulta bibliotecas digitales  \n'M'=muy a menudo\n'A'=a veces\n'C'=casi nunca \n'N'=nunca\n");
				scanf("%c",&consulta);
				fflush(stdin);
				switch(consulta)
				{
					case 'M':con=1;
					break;
					case 'A':con=2;
					break;
					case 'C':con=3;
					break;
					case 'N':con=4;
					break;
				}
				printf ("Consulta y visita la biblioteca universitaria  \n'M'=muy a menudo\n'A'=a veces\n'C'=casi nunca \n'N'=nunca\n");
				scanf("%c",&consulta1);
				fflush(stdin);
				switch(consulta1)
				{
					case 'M':con1=1;
					break;
					case 'A':con1=2;
					break;
					case 'C':con1=3;
					break;
					case 'N':con1=4;
					break;
				}
				fflush(stdin);
				pasa(cantidad,tip,con,con1,vcantidad,vtip,vcon,vcon1,j);
				j++;
			break;
			case 2:
				informar(vcantidad,vtip,vcon,vcon1,j);
			break;
			case 3:
			break;
			default:
				printf ("Error de tabulacion\n");
			break;	
   			
			
		}
		
	x=menu();	
	}while (x!=3);
	
	
}
int menu()
{
		system("color 01");
		int opa;
		printf ("\n\t\tOpción 1 - Ingresar datos de la encuesta:\n\t\tOpción 2 - Emitir resultados de la encuesta: \n\t\tOpción 3 - Salir.\n");
		scanf ("%i",&opa);
		fflush (stdin);
		return opa;
}

void pasa(int cantidad,int tip,int con,int con1,int *vcantidad,int *vtip,int *vcon,int *vcon1,int j)
{
	*(vcantidad+j)=cantidad;
	*(vtip+j)=tip;
	*(vcon+j)=con;
	*(vcon1+j)=con1;
	fflush(stdin);
}
void informar(int *vcantidad,int *vtip,int*vcon,int*vcon1,int j)
{
	int q,conn=0,c1=0,c2=0,c3=0,c4=0;
	float r1=0,r2=0,r3=0,r4=0;
	
	for(q=0;q<j;q++)
	{
		if (*(vcon+q)==4 && *(vcon1+q)==4)
		{
			conn++;
			
		}
		if (*(vcantidad+q)==1)
		{
			c1++;
		}
		else if (*(vcantidad+q)==2)
		{
			c2++;
		}
		else if (*(vcantidad+q)==3)
		{
			c3++;
		}
		else if (*(vcantidad+q)==4)
		{
			c4++;
		}
		r1=j*20/100;
		r2=j*50/100;
		r1=j*100/100;
		r1=j*101/100;
			printf ("<<<La cantidad de estudiantes y egresado que nunca consultan bibliotecas universitarias ni digitales es de [%i] \n",conn);
	
	printf ("el porcentaje de encuentados segun su cantidad de libros es: ");
	printf ("\n1=Entre 0 y 20:[%2.f] \n",r1);
	printf ("\n2=entre 21 y 50: [%2.f]\n ",r2);
	printf ("\n3=entre 51 y 100: [%2.f]\n",r3);
	printf ("\n4=más de 100:[%2.f]\n",r4);
	system("pause");
	system("cls");
		
	}
	
}

