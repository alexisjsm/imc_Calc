/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daw127
 */
public class Alumnos {
    private String nombre;
    private double peso;
    private double altura;
    public static int contaAlumno = 0;
 public Alumnos(){}
    public Alumnos(String nombre,double peso,double altura){
        this.nombre = nombre;
        this.peso   = peso;
        this.altura = altura;
        
        
    }
    
    public void sumAlu(int contalu){
        this.contaAlumno++;
    }
    
    public  int getAlu(){
        return this.contaAlumno; 
    }
    
    
    public void setNombre(String n){
        this.nombre = n; 
    }
    public void setPeso(double p){
        this.peso = p;
    }
    
    public void setAlt(double a){
        this.altura = a;
    }
    
    public String getNombre(){
        return this.nombre; 
    }
    
    public double  getPeso(){
        return this.peso;
    }
    public double getAlt(){
        return  this.altura;
    }
    
    public double getImc(){
       double total = peso / (altura * altura);
       return  total;
    }
    
    public  double mediaAlt(Alumnos[] clase){
        double media = 0;
                for ( int i = 0; i < clase[0].getAlt(); i++){
                    media+=clase[i].altura;
                }
                double total = media / clase[0].getAlu();
                return total; 
    }
    
    public double mediaPeso(Alumnos [] clase){
        double media = 0; 
        for (int i = 0; i < clase[0].getAlu(); i++) {
            media += clase[i].peso; 
        }
        double total = media / clase[0].getAlu(); 
        return total;
    }
}

