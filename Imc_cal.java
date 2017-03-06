/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.DecimalFormat;
import java.util.*;
/**
 *
 * @author alexis
 */
public class Imc_cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /*   String[] Nombre = {"Adrian", "Carla","Alvaro","Gustavo","Victor","Sara"};
        double[] Peso = {70.0,50.0,89.5,90.4,72.4,62.0};
        double[] Altura={1.85,1.5,1.75,1.80,1.72,1.60};
        double[] IMC = new double[6];
    */
     Scanner sc = new Scanner(System.in); 
     Scanner asc= new Scanner(System.in);
     DecimalFormat df = new DecimalFormat(".##"); 
     int x=0; 
     int numero = 0; 
          
     String buscar = " "; 
     
     
  /*  while(x<1){
        System.out.println("Cuantos alumnos hay en las clase? ");
            x = asc.nextInt(); 
            if(x<1){
                System.out.println("ERROR tiene que a ver por lo menos un alumno en clase");
            }
    }
     */
     Alumnos[] clase     = new Alumnos[30]; 
     while(numero!=6){
          
                  System.out.println("1 - Introduce Datos alumnos ");
                  System.out.println("2 - Ver datos alumnos");
                  System.out.println("3 - Listado IMC clase");
                  System.out.println("4 - Media Altura clase");
                  System.out.println("5 - media peso clase");
                  System.out.println("6 - Salir");
                  numero = asc.nextInt(); 
         switch(numero){
             
        
         case 1: 
             Alumnos aux = new Alumnos(); 
             
             System.out.println("¿Cual es tu nombre?");
             aux.setNombre(sc.nextLine());
             System.out.println("¿Cuanto pesas?");
             aux.setPeso(sc.nextDouble());
             System.out.println("¿Cuanto mides?");
             aux.setAlt(sc.nextDouble());
             clase[aux.getAlu()] = aux;
             aux.sumAlu(0);
             
            
             sc.nextLine(); // libera buffer
             
            /* for (int i = 0; i < x; i++) {
                 IMC[i] = Peso[i]/(Altura[i]*Altura[i]);
             }
             */
             break; 
            
         case 2: 
             System.out.println("Busca el nombre: ");
             buscar = sc.next(); 
                for (int i = 0; i <clase[0].getAlu(); i++) {
                    
                 if(clase[i].getNombre().equalsIgnoreCase(buscar)==true){
                     System.out.println("El nombre del alumno es: " + clase[i].getNombre() + " Pesa: " + clase[i].getPeso() + " Mide: " + clase[i].getAlt() + " IMC " + clase[i].getImc());
                 }
                 
             }
                 break; 
                 
                 
        
         case 3: 
             System.out.println("Lista de IMC: ");
             for (int i = 0; i < clase[0].getAlu(); i++) {
                 System.out.println("El/La alumna " + clase[i].getNombre() + ", el IMC es " + df.format(clase[i].getImc()) );
             }
             break;
             
            
         case 4: 
             System.out.println("la media de la altura es: " + clase[0].mediaAlt(clase));
             break;
         case 5:          
             System.out.println("la media del peso es: " + clase[0].mediaPeso(clase));
             break;

        
 /*   IF DE PESO      
             
             if(IMC[i]<17){
                System.out.println("El/La Alumno " + Nombre[i] + "tiene INFRAPESO");
            }
            if(IMC[i]>=17 && IMC[i]<18){
                System.out.println("El/La Alumno " + Nombre[i] + "tiene BAJO PESO");
            }

            if(IMC[i]>=18 && IMC[i]<25){
                System.out.println("El/La Alumno " + Nombre[i] + " tiene PESO NORMAL (SALUDABLE)");

            }
            if(IMC[i]>=25 && IMC[i]<30){
                System.out.println("El/La Alumno " + Nombre[i] + " tiene SOBREPESO");

            }
            if(IMC[i]>=30 && IMC[i]<35){
                System.out.println("El/La Alumno " + Nombre[i] + " tiene SOPREPESO CRONICO");

            }
            if(IMC[i]>=35 && IMC[i]<40){
                System.out.println("El/La Alumno " + Nombre[i] + " tiene OBESIDAD PREMORBIDA");

            }
            if(IMC[i]>40){
                System.out.println("El/La Alumno " + Nombre[i] + " tiene OBESIDAD MORBIDA");

            }
*/
            
            }
     } 
             

     }     
         
    }
     
     
    

