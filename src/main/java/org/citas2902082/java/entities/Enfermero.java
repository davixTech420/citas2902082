package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.*;

public class Enfermero extends Usuario {

    public Enfermero(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        // constructor de la clase padre
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
    }






    @Override
    public String toString() {
        return 
        super.toString() + "Enfermero [ nombre : "+ getNombres() + " Apellidos :"+ getApellidos() + " Documento "+  getNumeroIdentificacion() +  "]";

    }

}
