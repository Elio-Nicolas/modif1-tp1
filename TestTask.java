

import java.util.Scanner;
//import  java.io.File ;
import  java.util.ArrayList ;
import  java.util.Iterator ;

public class TestTask {
    
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);

        ArrayList<Task> ListaTarea = new ArrayList<Task>();
      // Task arr[]= new Task[3];
       int opcion;
       int prioridad,i=0,marca=0,elimina;
       String descripcion;
       Boolean estado;
       int tar;
       int año;
       int mes;
       int dia;
       String opc;
       int num;
       
       do{
           System.out.println("        MENU       ");
           System.out.println(" 0- salir          ");
           System.out.println(" 1- Agregar tarea  ");
           System.out.println(" 2- mostrar tarea ");
           System.out.println(" 3- Marcar tarea   ");
           System.out.println(" 4- Eliminar tarea  ");
           opcion=sc.nextInt();
          
           
           switch(opcion){
               
               case 1: 
                   
                   do{
                   
                  System.out.println(" Ingrese Descripcion ");
                  descripcion=sc.next();
                  do{
                  System.out.println(" Ingrese Estado  'true' or 'false' ");
                  estado=sc.nextBoolean(); 
                  }while( estado!= true && estado != false );
                  
                  System.out.println(" Ingrese numero de tarea");
                  num=sc.nextInt();
                  
                  do{
                  System.out.println(" Ingrese prioridad 'prioridad de 1 a 5 ");
                  prioridad=sc.nextInt();
                  }while(prioridad<=1 && prioridad >=5);
                  
                  do{
                  System.out.println(" Ingrese año");
                  año=sc.nextInt();
                  }while( año<=2000 && año>=2021);
                  
                  do{
                  System.out.println(" Ingrese mes");
                  mes=sc.nextInt();
                  }while( mes<1 && mes >12);
                  System.out.println(" Ingrese dia");
                  dia=sc.nextInt();
                  Task Tarea= new Task(descripcion,estado,num,prioridad,año,mes,dia);
                 // arr[i]= Tarea;
                  ListaTarea.add(Tarea);
                  
                  System.out.println(" desea seguir ingresando 'si' o 'no' ");
                  opc=sc.next();
                  
                   }while( !opc.equals("no"));
               break;
                
               case 2:
                   i=0;
                   if(!ListaTarea.isEmpty()){
                   
                 /*  for( i=0 ; i<1 ; ++i){
                       
                       System.out.println(" descripcion : "+ arr[i].getdescripcion());
                       System.out.println(" estado : "+ arr[i].getestado());                        
                       System.out.println(" Fecha : "+ arr[i].getfecha());
                       System.out.println(" Prioridad : "+arr[i].getprioridad());
                       System.out.println(" ");
                       
                   }*/
                   
                       Iterator<Task> Ite = ListaTarea.iterator();
                       
                       while(Ite.hasNext()){
                           
	               Task elemento = Ite.next();
                       
                       System.out.println("tarea : "+elemento.getnumero_tarea());
	               System.out.println("Descripcion :"+elemento.getdescripcion());
                       System.out.println("Estado :"+elemento.getestado());
                       System.out.println("Prioridad :"+elemento.getprioridad());
                       System.out.println("Fecha :"+elemento.getfecha());
                      //System.out.println(ListaTarea.get(0));
                       }
                       
                   }else System.out.println(" Lista de tareas vacia");
                       
                break; 
                
               case 3:
                   
                   if(!ListaTarea.isEmpty()){
                      
                       Iterator<Task> Ite = ListaTarea.iterator(); 
                 //  for(i=0 ; i<3 ;++i){
                     while(Ite.hasNext()){
                         
                       Task  elemento=Ite.next();
                     //  if( arr[i].getdescripcion()!=null){
       
                           System.out.println("tarea :"+elemento.getnumero_tarea());
                           System.out.println(" prioridad :"+elemento.getprioridad());
                       }
                    
                   
                   
                   System.out.println("Ingrese numero de tarea que desea marcar");
                   tar= sc.nextInt();
                   
               //    Iterator<Task> Ite = ListaTarea.iterator();
                    
                    while(Ite.hasNext() ){
                             
                        Task  elemento=Ite.next();
                        
                        if( tar == elemento.getnumero_tarea()){
                            
                            System.out.println(" Ingrese nueva prioridad");
                            prioridad= sc.nextInt();
                            elemento.setprioridad(prioridad);
                            marca=1;
                        }  
                       // i++;
                    }
                         
                     if(marca == 1)System.out.println(" Prioridad modificada");
                     
                   }else System.out.println(" Lista de tareas vacia");
                   
               break;
               
               case 4:
                   
                   if( !ListaTarea.isEmpty()){
                   
                   System.out.println(" Elija tarea que desea eliminar ");
                   Iterator<Task> Ite = ListaTarea.iterator();
                  // for(i=0 ; i<3 ;++i){
                  
                       while(Ite.hasNext()){
                           
                           Task  elemento =Ite.next();
                           
                             System.out.println("tarea :"+elemento.getnumero_tarea());
                          // System.out.println(" prioridad :"+elemento.getprioridad());
                           
                      // if( arr[i].getdescripcion()!=null){
                           
                           //System.out.println( " Tarea : "+ (i+1));
                       }
                   
                    elimina= sc.nextInt();
                  //  Iterator<Task> Ite = ListaTarea.iterator();

                    while( Ite.hasNext() ){
                        
                        Task  elemento =Ite.next();
                        
                        if( elimina==elemento.getnumero_tarea()){
                                    
                           /* arr[i-1].setdescripcion(null);
                            arr[i-1].setestado(false);
                            arr[i-1].setprioridad(0);
                            arr[i-1].getfecha();*/
                           ListaTarea.remove(elimina);
                            marca=1;
                        } 
                        
                       // i++;
                    }
                    
                    if(marca == 1)System.out.println(" Tarea eliminada");
                    
                   }else System.out.println(" Lista de tareas vacia");
                   
                 break;
                 
                   }
               
               
       }while(opcion != 0);
    }
}
