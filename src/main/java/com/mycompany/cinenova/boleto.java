
package com.mycompany.cinenova;
/**
 *
 * @author Richard
 * ¡¡NOTA!!: Para utilizar correctamente esta clase se debe llenar toda la informacion previamente en la clase funcion. 
 */
public class boleto {
    
//Atributos
    private int numFact;//Atributo para la factura
    private int numAut;//Atributo para la autorización
    private String nomCliente;//Atributo para el cliente
    private funcion newFuncion;//Atributo de referencia de la clase funcion
    private double IVA;//Atributo para el IVA
    private String asientosComprados;//Atributo de Asientos Comprados
    private int cantidadBoletos;//Atributo de Cantidad de Boletos
    private MetodosPago newMetodosPago;//Atributo de referencia de enum MetodosPago
    
//Constructor:
public boleto(int numFact, int numAut, String nomCliente, funcion newFuncion, double IVA, String asientosComprados, int cantidadBoletos, MetodosPago newMetodosPago){
    this.numFact=numFact;
    this.numAut=numAut;
    this.nomCliente=nomCliente;
    this.newFuncion = newFuncion;
    this.IVA = IVA;
    this.asientosComprados=asientosComprados;
    this.cantidadBoletos=cantidadBoletos;
    this.newMetodosPago = newMetodosPago;
    
}//Fin del Constructor

//Metodos:
public void InformacionBoleto (){
    System.out.println("INFORMACION DEL BOLETO");
    System.out.println();
    System.out.println("Numero de Factura: "+numFact);
    System.out.println("Numero de Autorizacion: "+numAut);
    System.out.println("Nombre del Cliente: "+nomCliente);
    System.out.println("Asientos Comprados: "+asientosComprados);
    System.out.println("Cantidad de Boletos: "+cantidadBoletos);
    System.out.println("Subtotal del Boleto: ₡"+(newFuncion.getprecioBoleto()-(newFuncion.getprecioBoleto()*IVA)));
    System.out.println("IVA: "+IVA+" o 13%");
    System.out.println("Total: ₡"+newFuncion.getprecioBoleto());
    System.out.println("Método de Pago: "+newMetodosPago);
    System.out.println("Nombre de la Pelicula: "+newFuncion.getpeli());
    System.out.println("Numero de la Sala: "+newFuncion.getsala());
    System.out.println("Fecha de la Funcion: "+newFuncion.getfecha());
    System.out.println("Horario de la Funcion: "+newFuncion.gethora());
}//Fin del metodo InformacionBoleto
//Fin de los Metodos

//Getter y Setter de numFact:
//Inicio Get
public int GetNumeroFactura(){
    return numFact;
}//Fin del get NumeroFactura
//Inicio del Set
public void SetNumeroFactura(int numFact){
    this.numFact = numFact;
    //PD:en futuros avances se generara automaticamente por el sistema, por el momento es manual.
}//Fin del set NumerFactura

//Getter y Setter de numAut:
//Inicio del Get
public int GetNumeroAutorizacion(){
    return numAut;
}//Fin del Get de NumeroAutorizacion
//Inicio del Set
public void SetNumeroAutorizacion(int numAut){
    this.numAut = numAut;    
    //PD:en futuros avances se generara automaticamente por el sistema, por el momento es manual.
    }//Fin del Set de NumeroAutorizacion

//Getter y Setter de nomCliente:
//Inicio del Get
public String GetNombreCliente(){
    if(nomCliente == null){
        return "SIN NOMBRE";
    }
    return nomCliente; 
}//Fin del Get de NombreCliente
//Inicio del Set
public void SetNombreCliente(String nomCliente){
    this.nomCliente= nomCliente;
}//Fin del Set de NombreCliente

//Getter y Setter del IVA:
//Inicio del Get
public double GetIVA(){
    return IVA;
}//Fin del get del IVA
//Inicio del Set
public void SetIVA(){
    this.IVA = 0.13;
}//Fin del set del IVA

//Getter y Setter del AsientosComprados
//Inicio del Get AsientosComprados
public String GetAsientosComprados(){
    if (asientosComprados == null) {
        return "SIN ASIENTOS SELECCIONADOS";
    }//fin del IF
    return asientosComprados;
}//Fin del Get
//Inicio del Set AsientosComprados
public void SetAsientosComprados(String asientosComprados){
    this.asientosComprados = asientosComprados;
}//Fin del Set 

//Getter y Setter del CantidadBoletos
//Inicio del Get CantidadBoleto
public int GetCantidadBoletos(){
    return cantidadBoletos;
}//Fin del Get
//Inicio del Set CantidadBoletos
public void SetCantidadBoletos(int cantidadBoletos){
    if (cantidadBoletos>newFuncion.getasientosDisponibles()) {
        System.out.println("Error, la cantidad de boletos seleccionados es mayor a la cantidad de boletos disponibles.");
    }//Fin del if
    this.cantidadBoletos=cantidadBoletos;
}//fin del Set

//Getter y Setter de Metodos de Pago
//Inicio del Get MetodoPago
public MetodosPago GetMetodoPago(){
    return newMetodosPago;
}//Fin del Get
//Inicio del Set MetodosPago
public void SetMetodosPago(MetodosPago newMetodosPago){
    this.newMetodosPago= newMetodosPago;
}//Fin del Set

}//Fin de la Clase boleto
