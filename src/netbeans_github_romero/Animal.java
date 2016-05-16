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
public class Animal {
    enum Identificacion {Herbivoro,Carnivoro,Omnivoro,Vertebrado,Invertebrado};
    enum Tipo1 {arrastra,acuatico,aire}
    enum Tipo {Ave,Mamifero,Reptil};
    enum Sex {Macho,Hembra};
    
    private String _Raza;
    private String _Nombre;
    private int _Edad;
    private Identificacion _Clase_Animal;
    private Tipo _Tipo_Animal;
    private Tipo1 _Tipo_desplazamiento;
    private Sex _Macho_Hembra;
    
}
