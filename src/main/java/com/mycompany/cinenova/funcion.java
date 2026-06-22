
package com.mycompany.cinenova;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author derek
 * 
 */
public class funcion {
//Atributos para la clase película:
    private int num_funcion;//Atributo para el número de función
    private pelicula peli;//Atributo para la pelicula
    private Sala sala;//Atributo para la sala
    private LocalTime hora;//Atributo para la hora
    private LocalDate fecha;//Atributo para la clase
    private double precioBoleto;//Atributo el precio del boleto
    private int asientos;//Atrinuto para los asientos
    private int asientosDisponibles;//Atributo para los asientos disponibles
    private EstadoFuncion estadoFuncion;//Atributo tipo para el estado de la funcion
//Constructores:
   public funcion(int num_funcion,pelicula peli,Sala sala,LocalTime hora,LocalDate fecha,double preciosBoleto,int asientos,int asientosDisponibles){
       this.num_funcion=num_funcion;
       this.peli=peli;
       this.sala=sala;
       this.hora=hora;
       this.fecha=fecha;
       this.precioBoleto=preciosBoleto;
       this.asientos=asientos;
       this.asientosDisponibles=asientosDisponibles;
       this.estadoFuncion=EstadoFuncion.Disponible;
   }
//Metodo:
   public void InfoFuncion(){
       //Inicio del metodo
        System.out.println("Número de función: "+num_funcion+
                            "\nPelícula: "+peli.getnombre_Peli()+
                            "\nSala: "+sala+
                            "\nHora: "+hora+
                            "\nFecha: "+fecha+
                            "\nPrecio del boleto: "+precioBoleto+
                            "\nAsientos disponibles: "+asientosDisponibles+
                            "\nEstado: "+estadoFuncion);
   }//Fin del metodo


//Getters y setter de num_funcion:
    public int getnum_funcion(){//Inicio del metodo get
        
        return num_funcion;
    }//Fin del metodo get
    public void setnum_funcion(int num_funcion){
        this.num_funcion=num_funcion;
    }
//Getters y setters de peli:
    public pelicula getpeli(){//Inicio del metodo get
        
        return peli;
    }//Fin del metodo get
    public void setpeli(pelicula peli){//Inicio del metodo set
        if(peli==null){
            System.out.println("La función debe tener una película asociada");
        }else{
            this.peli=peli;
        }
    }//Fin del metodo set

//Getters y setters de sala:
    public Sala getsala(){//Inicio del metodo get
        
        return sala;
    }//Fin del metodo get
    public void setsala(Sala sala){//Inicio del metodo set
        this.sala=sala;
    }//Fin del metodo set

//Getters y setters de hora:
    public LocalTime gethora(){//Inicio del metodo get
        
        return hora;
    }//Fin del metodo get
    public void sethora(LocalTime hora){//Inicio del metodo set
        this.hora=hora;
    }//Fin del metodo set

//Getters y setters de fecha:
    public LocalDate getfecha(){//Inicio del metodo get
        
        return fecha;
    }//Fin del metodo get
    public void setfecha(LocalDate fecha){//Inicio del metodo set
        this.fecha=fecha;
    }//Fin del metodo set

//Getters y setters de precioBoleto:
    public double getprecioBoleto(){//Inicio del metodo get
        
        return precioBoleto;
    }//Fin del metodo get
    public void setprecioBoleto(double precioBoleto){//Inicio del metodo set
        if(precioBoleto<=0){
            System.out.println("El precio no puede ser menor o igual a 0");
        }else{
            this.precioBoleto=precioBoleto;
        }
    }//Fin del metodo set

//Getters y setters de asientos:
    public int getasientos(){//Inicio del metodo get
        
        return asientos;
    }//Fin del metodo get
    public void setasientos(int asientos){//Inicio del metodo set
        if(asientos<=0){
            System.out.println("La cantidad de asientos no puede ser menor o igual a 0");
        }else{
            this.asientos=asientos;
        }
    }//Fin del metodo set

//Getters y setters de asientosDisponibles:
    public int getasientosDisponibles(){//Inicio del metodo get
        
        return asientosDisponibles;
    }//Fin del metodo get
    public void setasientosDisponibles(int asientosDisponibles){//Inicio del metodo set
        if(asientosDisponibles<0){
            System.out.println("Los asientos disponibles no pueden ser negativos");
        }else{
            this.asientosDisponibles=asientosDisponibles;
        }
    }//Fin del metodo set

//Getters y setters de estadoFuncion:
    public EstadoFuncion getestadoFuncion(){//Inicio del metodo get
        
        return estadoFuncion;
    }//Fin del metodo get
    public void setestadoFuncion(EstadoFuncion estadoFuncion){//Inicio del metodo set
        this.estadoFuncion=estadoFuncion;
    }//Fin del metodo set
   
}
