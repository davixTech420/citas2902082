package org.citas2902082.java.entities;
import org.citas2902082.java.entities.enums.*;

public class Medico {

    public Integer id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Integer numeroIdentifacion;
    public Integer registroMedico;
    public Especialidad especialidad;

    //constructor
    public Medico(String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Integer numeroIdentifacion,
            Integer registroMedico, Especialidad especialidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentifacion = numeroIdentifacion;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }
}
