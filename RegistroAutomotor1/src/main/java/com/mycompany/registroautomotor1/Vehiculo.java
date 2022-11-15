              /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroautomotor1;

/**
 *
 * @author LUCA
 */ 
public class Vehiculo {
    private String marca, titular, modelo, patente;
    private int año_patentamiento;
    private float precio;
    private boolean nacional;
    
    public Vehiculo()
    {
    marca = "";
    titular = "";
    patente = "";
    modelo = "";
    año_patentamiento = 0;
    precio = 0.0f;
    nacional= false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAño_patentamiento() {
        return año_patentamiento;
    }

    public void setAño_patentamiento(int año_patentamiento) {
        this.año_patentamiento = año_patentamiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isNacional() {
        return nacional;
    }

    public void setNacional(boolean nacional) {
        this.nacional = nacional;
    }
    
    public int calcularAntiguedad ()
    {
    int antiguedad;
    antiguedad = 2021 - año_patentamiento;
    return antiguedad;
    }
    
    public String IndicarVerificacionPolicial(){
       
        String respuesta;
        {
            if (calcularAntiguedad()>=2 && calcularAntiguedad()<=14) 
            {
                respuesta = "Verificacion Policial";
        
        }
        else
        {
                respuesta = "No necesita verificacion Policial";
                }
        
        return respuesta;
    
    }
    }
    public float calcularCostoT()
    {
    float costo;
    
    if (calcularAntiguedad()<10)
    { 
    costo = precio * 0.0f + 5000;
        }
    else
    {
            if (calcularAntiguedad() <=25)        
            {
    
            costo = precio* 0.04f + 2400;
                    }
    else 
    {
            costo = 2000;
            }
    }
    if (nacional == false)
    {
   costo = costo +10000; 
   
    
    }
    return costo;
    }
} //FIN DE LA CLASE
