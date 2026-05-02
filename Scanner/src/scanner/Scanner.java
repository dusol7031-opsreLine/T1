/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

/**
 *
 * @author dusol
 */
public class Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         java.util.Scanner sc = new java.util.Scanner(System.in);
        AlumnoControlador AlumnoControlador = new AlumnoControlador();
        String rpta="s";
        while(rpta.equals("s")){

            System.out.println("Ingrese  tipo de documento ");
            String tipodoc=sc.nextLine();
            
             System.out.println("Ingrese documento ");
            String numdoc=sc.nextLine();
            
            
            System.out.println("Ingrese nombre ");
            String nombre=sc.nextLine();
            
            System.out.println("Ingrese nivel socioeconomico");
            String nivsocio=sc.nextLine();
         
            System.out.println("ingrese beca");
            String beca=sc.nextLine();

            Alumno e1 =new Alumno("");

            
            e1.setTipodoc(tipodoc);
            e1.setNumdoc(numdoc);
            e1.setNombre(nombre);
            e1.setNivsocio(nivsocio);
            e1.setBeca(beca);
            
            System.out.println("Los datos del alumno creado son:");
            e1.verDatos();

            //control.agregaralumnos(e1);
            //System.out.println("Desea agregar más estudiantes: s/n");
            //rpta=sc.nextLine();
             try {
             String Alumno=sc.nextLine();
             if (Alumno.isEmpty()){
                 throw new Exception();
             }
        }
        catch (Exception a) {
            System.out.println("no puedes dejar el codigo vacio");
                                
        }
        }
    }
    
}
