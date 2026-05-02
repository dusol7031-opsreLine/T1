/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;

import java.util.ArrayList;

/**
 *
 * @author dusol
 */
public class AlumnoControlador {
     ArrayList<Alumno> lista_alumnos = new ArrayList();
    
    public void agregar_estudiante(Alumno nuevo_estudiante){
        lista_alumnos.add(nuevo_estudiante);
    }
    public void listar_estudiantes(){
        System.out.println("La lista de estudiantes es: ");
        if(lista_alumnos.isEmpty()){
            System.out.println("La lista está vacía");
            return;
        }
        for(Alumno es :lista_alumnos){
            es.verDatos();
        }
        
    }
    

    
}
