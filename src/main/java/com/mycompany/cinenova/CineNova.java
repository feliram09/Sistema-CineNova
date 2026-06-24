/*
Entrega Avance 1 
Objetivo: Implementar la estructura base del proyecto aplicando los fundamentos de programación 
orientada a objetos vistos durante las primeras semanas del curso. 

Requisitos:
Creación de las clases: Película,Función y Boleto.  
Encapsular atributos usando metodos de acceso.
Usar constructores adecuados para cada clase.
Crear y utilizar enums definidos en el enunciado.
Relacionar las clases película,Función y boleto
Menú principal 
Registrar dos a 3 películas para validar el funcionamiento de la clase
Mostrar películas registradas durante el avance del proyecto.
*/
package com.mycompany.cinenova;

import javax.swing.JOptionPane;

/*
 @author Derek Caravaca
 @author Felipe Ramirez
 @author Emanuel Camacho
*/ 
public class CineNova {

    public static void main(String[] args) {
        
    //Declaración de las películas en null:
    pelicula pelicula1 = null;//Variable para almacenar la primera película
    pelicula pelicula2 = null;//Variable para almacenar la segunda película
    pelicula pelicula3 = null;//Variable para almacenar la tercera película
    pelicula1 = new pelicula("peli001", "Star Wars", Genero.Accion, 120, clasifacion_Pelicula.Mayores_de_quince, "La galaxia está en guerra y un joven héroe descubre su destino.");
    pelicula2 = new pelicula("peli002", "El Rey León", Genero.Animacion, 88, clasifacion_Pelicula.Todo_publico, "Un joven león debe reclamar su lugar como rey tras la muerte de su padre.");
    pelicula3 = new pelicula("peli003", "It", Genero.Terror, 135, clasifacion_Pelicula.Mayores_de_dieciocho, "Un grupo de niños enfrenta a una entidad maligna que se disfraza de payaso.");
    
    int opcion;//Variable para almacenar la opción del usuario
    
        do{//Inicio del bucle del menú principal
            
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite alguna de las opciones: \n"
                    + "1. Agregar película\n"
                    + "2. Mostrar películas\n"
                    + "3. Salir del sistema"));
             
            switch (opcion){//Inicio del switch del menú principal
                
            case 1://Opción para agregar una película
            
            //Solicitud de datos de la película al usuario:
                String codigo = JOptionPane.showInputDialog("Digite: \n" + "Código de la pelicula, ejemplo: Peli001");//Código de la película
                String nombre = JOptionPane.showInputDialog("Digite: Nombre de la pelicula");//Nombre de la película
                String sinopsisNueva = JOptionPane.showInputDialog("Digite: Sinopsis");//Sinopsis de la película
                int duracion = Integer.parseInt(JOptionPane.showInputDialog("Digite: Duracion, en minutos"));//Duración en minutos
                int opcionGenero = Integer.parseInt(JOptionPane.showInputDialog("Seleccione genero:\n1. Accion\n2. Comedia\n3. Drama\n4. Terror\n5. ciencia_Ficcion\n6. Animacion\n7. Aventura\n8. Noasignado"));//Opción del género
                int opcionClasificacion = Integer.parseInt(JOptionPane.showInputDialog("Digite Clasificacion:\n1. Todo_publico\n2. Mayores_de_siete\n3. Mayores_de_doce\n4. Mayores_de_quince\n5. Mayores_de_dieciocho\n6. Noasignado"));//Opción de la clasificación

            //Asignación del género según la opción elegida:
                Genero generoNueva = Genero.Noasignado;//Se inicializa en Noasignado por si el usuario digita una opción inválida
                switch(opcionGenero){//Inicio del switch del género
                    case 1: generoNueva = Genero.Accion; break;
                    case 2: generoNueva = Genero.Comedia; break;
                    case 3: generoNueva = Genero.Drama; break;
                    case 4: generoNueva = Genero.Terror; break;
                    case 5: generoNueva = Genero.ciencia_Ficcion; break;
                    case 6: generoNueva = Genero.Animacion; break;
                    case 7: generoNueva = Genero.Aventura; break;
                    case 8: generoNueva = Genero.Noasignado; break;
                }//Fin del switch del género
                    
            //Asignación de la clasificación según la opción elegida:
                clasifacion_Pelicula clasificacion = clasifacion_Pelicula.No_asignado;//Se inicializa en No_asignado por si el usuario digita una opción inválida
                switch(opcionClasificacion){//Inicio del switch de la clasificación
                    case 1: clasificacion = clasifacion_Pelicula.Todo_publico; break;
                    case 2: clasificacion = clasifacion_Pelicula.Mayores_de_siete; break;
                    case 3: clasificacion = clasifacion_Pelicula.Mayores_de_doce; break;
                    case 4: clasificacion = clasifacion_Pelicula.Mayores_de_quince; break;
                    case 5: clasificacion = clasifacion_Pelicula.Mayores_de_dieciocho; break;
                    case 6: clasificacion = clasifacion_Pelicula.No_asignado; break;
                }//Fin del switch de la clasificación
                
            //Almacenamiento de la película en la primera variable disponible:
                if (pelicula1 == null){
                    pelicula1 = new pelicula(codigo, nombre, generoNueva, duracion, clasificacion, sinopsisNueva);
                } else if (pelicula2 == null){
                    pelicula2 = new pelicula(codigo, nombre, generoNueva, duracion, clasificacion, sinopsisNueva);
                } else if (pelicula3 == null){
                    pelicula3 = new pelicula(codigo, nombre, generoNueva, duracion, clasificacion, sinopsisNueva);
                } else {
                    JOptionPane.showMessageDialog(null, "No hay espacio para más películas");//Mensaje si ya no hay espacio
                }    
                break;//Fin del case 1

            case 2://Opción para mostrar las películas registradas
            
                boolean hayPeliculas = false;//Variable para verificar si hay películas registradas
                if (pelicula1 != null){//Inicio del if para verificar si pelicula1 tiene datos
                    pelicula1.mostrar_Info_Peli();
                    hayPeliculas = true;
                }//Fin del if
                if (pelicula2 != null){//Inicio del if para verificar si pelicula2 tiene datos
                    pelicula2.mostrar_Info_Peli();
                    hayPeliculas = true;
                }//Fin del if
                if (pelicula3 != null){//Inicio del if para verificar si pelicula3 tiene datos
                    pelicula3.mostrar_Info_Peli();
                    hayPeliculas = true;
                } else if (hayPeliculas == false){//Si ninguna película tiene datos
                    System.out.println("No hay peliculas registradas.");
                }
                break;//Fin del case 2
                
            case 3://Opción para salir del sistema
                System.out.println("Gracias por usar nuestro Sistema!");
                break;//Fin del case 3

        }//Fin del switch del menú principal
        } while (opcion != 3);//Fin del bucle, se repite mientras el usuario no elija salir
        
    }
}

