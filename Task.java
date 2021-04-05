
 // clase Task donde estaran nuestros atributos y metodos
import java.time.*;

public class Task {
    
    private String descripcion=null;
    private Boolean estado=true;
    private int prioridad=0;
    private LocalDate fecha;
    private int Numero_Tarea;

     Task( String desc , Boolean est,int num,int priori,int año,int mes,int dia ){
        
       this.descripcion= desc;
       this.estado=est;
       this.prioridad=priori;
       this.fecha=LocalDate.of( año,mes, dia);
       this.Numero_Tarea=num;
    }

public int getnumero_tarea(){
    return Numero_Tarea;
}     
 
public void setnumerotarea(int Numero_Tarea){
    this.Numero_Tarea=Numero_Tarea;
}

public String getdescripcion (){
     return descripcion;
}

public void setdescripcion (String descripcion){
    this.descripcion = descripcion;
}     

public Boolean getestado (){
     return estado;
}

public void setestado (Boolean estado){
    this.estado = estado;
}   

public LocalDate getfecha (){
     return fecha;
}

public int getprioridad (){
     return prioridad;
}

public void setprioridad (int prioridad){
    this.prioridad = prioridad;
}   

}
