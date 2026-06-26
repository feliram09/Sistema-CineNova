package com.mycompany.cinenova;
/**
 * 
 * @author derek c Apuy
 * 
 */
public class pelicula {
//1-Atributos de la clase pelicula
    private String code;//Este atributo almacenara el código de la peli
    private String nom_Peli;//El atributo se refiere al nombre de la pelicula.
    private Genero gen;//Atributo tipo genero para poder darle un genero a la pelicula
    private int duracion_Peli;//Este atributo tendrá la duración de las peliculas
    private clasifacion_Pelicula clasi;//Atributo tipo Clasificación_Pel la clasicación de la pelicula
    private EstadoPelicula est;
    private String sinopsis;//Atributo para las sinopsis de las peliculas
    
//2-Constructor:
//Constructor completo (no se puede omitir valores debido a que todos son necesarios).
    public pelicula(String code,String nombrePeli,Genero genero,int duracion,clasifacion_Pelicula clasificacion,String sinopsis){//Inicio del constructor
        this.code=code;
        this.nom_Peli=nombrePeli;
        this.gen=genero;
        this.duracion_Peli=duracion;
        this.clasi=clasificacion;
        this.sinopsis=sinopsis;
        this.est = EstadoPelicula.Disponible;
    }//Fin del constructor
 
//Metodos :
    public void mostrar_Info_Peli(){//Inicio del metodo
        System.out.println("Código: "+code+
                            "\nNombre de la película: "+nom_Peli+
                            "\nGenero: "+gen+
                            "\nDuración: "+duracion_Peli+
                            "\nClasificación: "+clasi+
                            "\nEstado:"+est+
                            "\nSinopsis: "+sinopsis);
    }//Fin del metodo

//Getters y setter de code:
    public String getcode(){//Inicio del metodo get
         
        return code;
    }//Fin del metodo get
    public void setcode(String code){//Inicio del if
           this.code=code;
    }//Fin del metodo set
 //Getters y setters de nombre pelicula:
    public String getnombre_Peli(){//Inicio del metodo get
        
        return nom_Peli;
    }//Fin del metodo get
    public void setnombre_Peli(String nom_peli){//Inicio del metodo set
        if(nom_peli==null){
            System.out.println("Ingresa un valor");
        }else{
            this.nom_Peli=nom_peli;
        }
    }//Fin del metodo set
//Getters y setters de gen:
    public Genero getGen(){//Inicio del metodo get
        
        return gen;
    }//Fin del metodo get
    public void setGen(Genero gen){//Inicio del metodo set
        this.gen=gen;
    }//Fin del metodo set   
//Getters y setters de duracion_Peli:
    public int getduracion_peli(){//Inicio del metodo get
        
        return duracion_Peli;
    }//Fin del metodo get
    public void setduracion_Peli(int duracionPeli){//Inicio del metodo set
        if (duracionPeli<=0) {
            System.out.println("No puede durar 0 la película");
        }else{
            this.duracion_Peli=duracionPeli;
        }
    }//Fin del metodo set     
//Getters y setters de Clasificacion pelicula:
    public clasifacion_Pelicula getclasificacion_Peli(){//Inicio del metodo get
        
        return clasi;
    }//Fin del metodo get
    public void setclasifacion_peli(clasifacion_Pelicula clasi){//Inicio del metodo set
        this.clasi=clasi;
    }//Fin del metodo set    
//Getters y setters de sinopsis:
    public String getsinopsis(){//Inicio del metodo get
        
        return sinopsis;
    }//Fin del metodo get
    public void setsinopsis(String sinopsis){//Inicio del metodo set
        if (sinopsis==null) {
            System.out.println("Ingrese un valor");
        }else{
            this.sinopsis=sinopsis;
        }
    }//Fin del metodo set    
//Getter de estado pelicula:
    public EstadoPelicula getEstado(){
        return est;
    }
//Setter de estado película:
    public void setEstado(EstadoPelicula est){
        this.est=est;
    }
}
