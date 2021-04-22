/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase21abril;
import java.util.Scanner;
/**
 *
 * @author Adrian Quej
 */
public class Clase21abril {
    public static int hora;
    public static String dia;
    public static int mes;
    public static int opciones;
    public static void encabezado() {
        System.out.println("Universidad Autonoma de Campeche");
        System.out.println("Facultad de Ingenieria");
        System.out.println("Ingenieria en Sistemas Computacionales");
        System.out.println("Abril 2021");
        System.out.println("ADRIAN ERNESTO AGUILAR QUEJ");
    }
    public static void cuerpo(){
        System.out.println("--------------------");
        System.out.println("ACTIVIDAD 2");
        System.out.println("Seleccione la opcion a efectuar");
        System.out.println("1 - Revisar Horario");
        System.out.println("2 - Conocer dia habil o fin de semana");
        System.out.println("3 - Conocer en que trimestre del año nos encontramos");
        System.out.println("--------------------");
    }
    public static void pie(){
        System.out.println("-----------");
        System.out.println("AQ.2021");
    }
    public static void Horario(){
        System.out.println("Este es el horario de Adrian Quej del día martes");
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe una hora del día entre las 0 y 24 horas para mostrar el horario");
        hora = miConsola.nextInt();
        
        switch(hora){
        
            case 0,1,2,3,4,5,6:
                System.out.println("Dormir");
                break;
            case 7,8:
                System.out.println("Desayunar");
                break;
            case 9,10:
                System.out.println("Clase de Física");
                break;
            case 11,12:
                System.out.println("Clase de Ingles");
                break;
            case 13,14:
                System.out.println("Clase de Organización Computacional");
                break;
            case 15:
                System.out.println("Hora de Comer");
                break;
            case 16,17:
                System.out.println("Hacer tarea");
                break;
            case 18:
                System.out.println("Bañarse");
                break;
            case 19,20:
                System.out.println("Clase de Lenguaje de Programación I");
                break;
            case 21:
                System.out.println("Hora de cenar");
                break;
            case 22,23,24:
                System.out.println("Tiempo de esparcimiento");
                break;
            default :
                if (hora>24 || hora<0) {
                    System.out.println("Se debe escribir una hora entre 0 y 24");
                }
    }
    }
    public static void DiaSemana(){
    
       System.out.println("Este programa te dirá si el dia de la semana es habil o es fin de semana");
       Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana: ");
        dia = miConsola.nextLine();; 
        
        switch(dia){
        
            case "lunes","martes","miercoles","jueves","viernes":
                System.out.println("Es dia habil");
                break;
            case "LUNES","MARTES","MIERCOLES","JUEVES","VIERNES":
                System.out.println("Es dia habil");
                break;
            case "Lunes","Martes","Miercoles","Jueves","Viernes":
                System.out.println("Es dia habil");
                break;
            case "Sabado","Domingo":
                System.out.println("Es fin de semana");
                break;
            case "SABADO","DOMINGO":
                System.out.println("Es fin de semana");
                break;
            case "sabado","domingo":
                System.out.println("Es fin de semana");
                break;
             default :
                 System.out.println("Debes escribir bien el nombre dia sin acento");
        }   
    }
    public static void Trimestre(){
    
        Scanner miConsola = new Scanner(System.in);
        System.out.println("Escribe el numero de mes del 1 al 12 para conocer en que trimestre nos encontramos: ");
        mes = miConsola.nextInt();
        
        switch  (mes){
            case 1,2,3:
                System.out.println("Nos encontramos en el primer trimestre del año");
                break;
            case 4,5,6:
                System.out.println("Nos encontramos en el segundo trimestre del año");
                break;
            case 7,8,9:
                System.out.println("Nos encontramos en el tercer trimestre del año");
                break;
            case 10,11,12:
                System.out.println("Nos encontramos en el cuarto trimestre del año");
                break;
            default:
                System.out.println("Debes escribir un numero del 1 al 12 correspondiente al mes del año");
        }
    }
    
    public static void Principal(int opcion){
    switch(opcion){
        
            case 1:
                Horario();
                break;
            case 2:
                DiaSemana();
                break;
            case 3:
                Trimestre();
                break;
            default :
                System.out.println("Opcion no valida");
        }
    }
    public static void main(String[] args){
    
        encabezado();
        cuerpo();
        Scanner miConsola = new Scanner(System.in);
        opciones = miConsola.nextInt();
        Principal(opciones);
        pie();
    }

}
    
   
   
    
