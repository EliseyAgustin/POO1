/*
Final Diciembre 2019 versión 1
*/
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
#include <locale.h>
#define tam 5

// obligatorioas
void armarresultados(char *vx, float *vy, float *vz);
// opcionales
int menu();

main()
{
      int opc=0, i=0, j, cant, cont, vmenu, tren;   
      float potencia, vpotencia[tam]={0};
      float ton, vcantton[tam]={0}, pesopersonas;
      char tipo, vtipo[tam]={'z'};
      setlocale(LC_CTYPE,"spanish");
      
      vmenu=menu();
      while(vmenu!=3)
      {       
         switch(vmenu)
         {
             case 1:
                  printf("ARMADO DE TRENES:\n");
                  printf("-------\n\n");
                  
                  printf("Ingrese Código de tren:\n");
                  fflush(stdin);
                  scanf("%d",&tren);
                  
                  do {
                  printf("Ingresar Tipo L, P, C: \n");
                  fflush(stdin);
                  scanf("%c",&tipo);
                  }
                  // control tipo
                  while 
                   ((tipo =='P' || tipo=='C' ) && (vtipo[tren-1] =='P' || vtipo[tren-1]=='C') && (vtipo[tren-1] != tipo));
                  
                  
                  if (tipo=='L')
                  {
                  	printf("Ingrese potencia:\n");
                    fflush(stdin);
                    scanf("%f",&potencia);
				  }
				  else potencia=0;
				  
				  if (tipo=='P')
				  {
				  printf("Ingrese Cantidad de pasajeros:\n");
                  fflush(stdin);
                  scanf("%d",&cant);
                  }
                  else cant=0;
              
                  if (tipo=='C')
				  {
				  printf("Ingrese toneladas de carga:\n");
                  fflush(stdin);
                  scanf("%f",&ton);
                  }
                  else ton=0;
                  
                
                   j=tren-1;  // posición según el tren
     
                   pesopersonas= cant*0.08;  // cant*80 son kilos, paso los kilos a toneladas
                   
                   vpotencia[j]= vpotencia[j] + potencia;
                   vcantton[j]= vcantton[j]+ pesopersonas + ton;  // sumo toneladas
                   if (tipo=='P' || tipo=='C' )  {vtipo[j]=tipo;}
                     
                  getch();
                  system("CLS");
                  break;
             case 2:  
                  // control al menos 1 locomotora
                  cont=0;
                   for(j=0;j<5;j++) // recorro el vector
        			{ 
        			if (vpotencia[j]>0) cont=cont+1;
        		    }
        		    if (cont==5)
                     armarresultados(vtipo, vpotencia, vcantton);
                     else printf ("Todos los trenes no tienen locomotora");
                     
                  getch();
                  break;                    
         }
        vmenu=menu();
}
}
////////////////////////////////////////////////////////////////////////////////
void armarresultados(char *vx, float *vy, float *vz)
{ 
     int  cantok=0;
	 float cantt=0;
     int j; 
    
        for(j=0;j<5;j++) // recorro el vector
        { 
        printf("Valores %c    %f    %f   \n", *vx, *vy, *vz); 
        if (*vy>=*vz)
        {
        cantok=cantok+1;	
		printf("Código de tren %d  tipo %c se puede mover\n", j+1, *vx); 
		
		cantt=cantt+*vz; 
	    }
		else  
        { printf("Código de tren %d tipo %c no se puede mover\n", j+1, *vx); }
		
        vx++;  
        vy++;
        vz++;
        }      
    printf("Cantidad de trenes que se pueden mover %d\n", cantok);    
	printf("Cantidad total de toneladas de los que se pueden mover OK %f\n", cantt);          
          
    system("pause");
     
}
////////////////////////////////////////////////////////////////////////////////
int menu()
{
    int opc;
         printf("PROGRAMA TRENES\n");
         printf("*****************\n\n\n");
         printf("1-Cargar vagones y asignar a tren\n");
         printf("2-Verificar trenes\n");
         printf("3-Salir\n");
         scanf("%i",&opc);
         return opc;
}    
