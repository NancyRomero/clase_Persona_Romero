/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeans_github_romero;

/**
 *
 * @author windows 8
 */
public class NETBEANS_GITHUB_ROMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        estudiante e=new estudiante();
        e.setNombre("Nancy");
        e.setApellido("Romero");
        e.setEdad(26);
        e.setDireccion("bellavista");
        e.setPeso(152);
        e.setCodigo(001);
        e.setFacultad("sistemas");
        e.setCarrera("sistemas");
        e.setNivel("sistemas");
       System.out.println("la nombre es:" +e.getNombre());
        System.out.println("el Apellido es:" +e.getApellido());
        System.out.println("la Edad es:" +e.getEdad());
        System.out.println("la Direccion es:" +e.getDireccion());
        System.out.println("el Peso es:" +e.getPeso());
        System.out.println("el codigo es:" +e.getCodigo());
         System.out.println("la facultad es:" +e.getFacultad());
        System.out.println("la carrera es:" +e.getCarrera());
        System.out.println("el nivel es:" +e.getNivel());
        
    }
    }
    
