/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

/**
 *
 * @author dusol
 */
public class Alumno {
    String nombre;
    String tipodoc;
    String numdoc;
    String nivsocio;
    String beca;
    
     public Alumno(String beca) {
        this.beca = beca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getNumdoc() {
        return numdoc;
    }

    public void setNumdoc(String numdoc) {
        this.numdoc = numdoc;
    }

    public String getNivsocio() {
        return nivsocio;
    }

    public void setNivsocio(String nivsocio) {
        this.nivsocio = nivsocio;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
     public void verDatos(){
        System.out.println("tipo de docuumento del alumno: "+this.tipodoc + 
                "indique el numero de documento: "+this.numdoc+"indique el"
                        + " nivelsocioeconomico:"+this.nivsocio+
                "indique la beca: "+this.beca);
    }
    
    
}
