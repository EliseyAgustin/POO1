/*Final segunda fecha diciembre 2019*/
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

// obligatorioas
void informarjugada(float *vx, float *vy, char *vz);

// opcionales
char calcolor (int);
int menu();

main()
{
      int opc=0, i=0, j, vmenu;
      char vcolor[4]={'Z'};
      float vapuesta[4]={0}, vahorros[4]={0};
      
      vmenu=menu();
      while(vmenu!=4)
      {       
         switch(vmenu)
         { 
             case 1:
                  for (j=0;j<4;j++)
                  {
                  printf("Ingresar ahorros del jugador %d: \n", j+1);
                  fflush(stdin);
                  scanf("%f",&vahorros[j]);
                  }
                 
                  break;   
             case 2:
             	  // cargar apuestas
             	  printf("Cargar apuestas de los 4 jugadores\n");
             	  
             	 for (j=0;j<4;j++)
                  {
                  do
                  {
                  printf("Ingresar apuesta del jugador %d, cero para no apostar: \n", j+1);
                  fflush(stdin);
                  scanf("%f",&vapuesta[j]);
                  } while (vapuesta[j] > vahorros[j]);
                  
                  if (vapuesta[j]> 0)
                  { printf("Ingresar color del jugador, R o N  %d: \n", j+1);
                  fflush(stdin);
                  scanf("%c",&vcolor[j]);}
                  else {vcolor[j]='Z';}
                  
                  } 
                  break;
                  
             case 3:
             	 
                  informarjugada(vahorros, vapuesta, vcolor);
                
                  getch();
                  break;    
			 case 4:   break;             
         }
        vmenu=menu();
}
}
////////////////////////////////////////////////////////////////////////////////
void informarjugada(float *vx, float *vy, char *vz)
{ 
     int numero, j;
     char color;
     
        printf("Ingresar numero\n");
                  fflush(stdin);
                  scanf("%d",&numero);
                  
        color=calcolor(numero);     // el color que salio   
    
        for(j=0;j<4;j++) // recorro todos los vectores
        { 
        if (*vz==color) { *vx=*vx-*vy+*vy*2;}  // gano
        else {*vx=*vx-*vy;} // perdio, resto lo que perdio
                                 
            
        printf("Jugador %d\t ahorro %f\t apuesta %f\t color %c\n", j+1, *vx,*vy,*vz);  // informo punto a
                                
        vx++;
		vy++; // sumo los punteros
        vz++;   
        }
     system("pause");
}

////////////////////////////////////////////////////////////////////////////////
int menu()
{
    int opc;
         printf("PROGRAMA RULETA\n");
         printf("*****************\n\n\n");
         printf("1-Cargar ahorros de los jugadores\n");
         printf("2-Realizar una apuesta\n");
         printf("3-Jugar a la ruleta\n");
         printf("4-Salir\n");
         scanf("%i",&opc);
         return opc;
}    
char calcolor (int a)   
{   char color;
    switch(a)
   {
   	case 0: color='Z'; break;
   	case 1:
   	case 3:
   	case 5:
   	case 7:
   	case 9: 
	case 12:
	case 14:
	case 16:
	case 18:
	case 21:
	case 23:
	case 25:
	case 27:
	case 30:
	case 32:
	case 34:
	case 36: color='R'; break;
   	default: color='N';
   }
    return color;          
}
