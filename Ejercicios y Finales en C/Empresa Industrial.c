#include <stdio.h>
#include <stdlib.h>
#include <locale.h> 

void codprovedor(int);
void carga(char, float, int, int*, char*, float*, int);
void informe(int*, char*, float*, int);
int opciones ();

int main(){
	char cod_ins, vcod_ins[50]={""};
	float pup, vpup[50]={0};
    int menu, i=0, cont_pro=0, vcod_pro[50]={0};
    setlocale (LC_CTYPE,"spanish");

do{
	menu=opciones ();
	     
	switch(menu){
		     case 1:
		     printf("Ingrese Codigo de insumo: 'a', 'b', 'c': ");
		     scanf("%s",&cod_ins);
		     fflush(stdin);
		     printf("Ingrese precio unitario en pesos: ");
		     scanf("%f",&pup);
		     fflush(stdin);
		     codprovedor(cont_pro);
		     carga(cod_ins, pup, cont_pro, vcod_pro, vcod_ins, vpup, i);
		     i++;
			 break;
			 case 2:
			 informe(vcod_pro, vcod_ins, vpup, i);
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

int opciones (){
 
		int menu;
		system("color 02");
		printf("\n||\t      FABRICA INGRESO DE DATOS\t    ||");
	    printf("\n\t\tMENU\n");
		printf("\nOpcion 1: Ingresar cotizaciones");
		printf("\nOpcion 2: Analisis de precios y seleccion de nuevo proveedor");
		printf("\nOpcion 3: Salir\n");
		scanf("%d",&menu);
		system ("cls");
		return menu;
} 

void codprovedor (int cont_pro){
     cont_pro=cont_pro+1;
	}

void carga(char cod_ins, float pup, int cont_pro, int *vcod_pro, char *vcod_ins, float *vpup, int i) {
	*(vcod_ins+i)=cod_ins;
	*(vpup+i)=pup;
	*(vcod_pro+i)=cont_pro;
	printf("Codigo Proveedor: [%i]",*(vcod_pro+i));
}


void informe(int *vcod_pro, char *vcod_ins, float *vpup, int i){
	int j=0,flag=0;
	float mina=0,minb=0,minc=0;
	
	for (j=0;j<*(vcod_pro);j++){
		
			if(flag==0){
				
		    if(*(vcod_ins)=='a'){
				mina=*(vpup);
			}
			if(*(vcod_ins)=='b'){
				minb=*(vpup);	
		    }
		
			if(*(vcod_ins)=='c'){
			minc=*(vpup);
		}
		flag=1;
	}
	
			if(*(vcod_ins)=='a'){
				if(mina<*(vpup)){
						mina=*(vpup);}	}
			if(*(vcod_ins)=='b'){
				if(mina<*(vpup)){
						minb=*(vpup);	}	}
			if(*(vcod_ins)=='c'){
				if(mina<*(vpup)){
							minc=*(vpup);}}
							
		}
		printf ("El precio minimo del insumo a es:  [%2.f]\n" ,mina);
		printf ("El precio minimo del insumo b es:  [%2.f]\n" ,minb);
		printf ("El precio minimo del insumo c es:  [%2.f]\n" ,minc);
	}
	
	

