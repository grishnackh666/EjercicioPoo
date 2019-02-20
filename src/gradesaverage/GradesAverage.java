
package gradesaverage;

import java.util.Scanner;


public class GradesAverage {

    
    public static void main(String[] args) {
            Scanner ac = new Scanner(System.in);
            int h=1;
            System.out.println("digite el numero estudiantes: ");
            int numStudents = ac.nextInt();
            int calificaciones[] = new int[numStudents];
            float promedio;
            int suma=0;
            
            for(int i=0; i<numStudents; i++){
                    System.out.print("Ingrese el grado para estudiante "+h+" :");
                    int k=0;
                    do{
                        k = ac.nextInt();
                        if(k>=100){System.out.print("Grado inválido, inténtalo de nuevo ...");}
                    }while(k>=100);
                    calificaciones [i] = k;
                    h++;
                 
                }
            for(int p=0; p<calificaciones.length; p++){
                suma+=calificaciones[p];
            }
            promedio=(suma/calificaciones.length);
            System.out.println("el promedio es: "+promedio);
           }
     }
    

            
