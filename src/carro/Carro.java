/*
Juan Diego Reyes Zepeda
5090-18-5233
*/

package carro;


class vehiculo{
    private String Marca;
    private String Modelo;
    private String Color;
    private String Matricula;
    private double Precio;
    static double descuento = 2000;
    
    
    vehiculo(String Marca, String Modelo, String Color, String Matricula, double Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Matricula = Matricula;
        this.Precio = Precio; 
    }
    
    /*Metodo modificadores*/
    public void setMarca(String Marca){
        this.Marca = Marca; 
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo; 
    }
    public void setColor(String Color){
        this.Color = Color; 
    }
    public void setMatricula(String Matricula){
        this.Matricula = Matricula; 
    }
    public void setPrecio(double Precio){
        this.Precio = Precio; 
    }
    
    /*Metodo Accesores*/
    public String getMarca(){ return Marca;}
    public String getModelo(){ return Modelo;}
    public String getColor(){ return Color;}
    public String getMatricula(){ return Matricula;}
    
    public void Mostrar(){
        System.out.println("Marca: "+getMarca()+"\nModelo: "+getModelo()+"\nColor: "+getColor()+"\nMatricula: "+getMatricula());
        System.out.println("");
    }
}

public class Carro{
    public static void main(String[] args){
        vehiculo a1  ;
        a1= new vehiculo("seat", "leon", "rojo", "1234bbb", 10000);
        a1.Mostrar();
        vehiculo a2  ;
        a2= new vehiculo("Ferrari", "Enzo", "Rojo", "5555JJKK", 55000);
        a2.Mostrar();
        vehiculo a3;
        a3= new vehiculo("Renault", "Clio", "Gris", "4444gfb", 8000);
        a3.Mostrar();
        
    }
}