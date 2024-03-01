package org.citas2902082.java.entities;
 import java.time.*;
public class Cita {
    public Integer id;
    public LocalDateTime fecha;

    //relaciones
    public Medico medico;
    public Consultorio consultorio;
    public Paciente paciente;


    //constructor
    public Cita(LocalDateTime fecha, Medico medico, Consultorio consultorio, Paciente paciente) {
        this.fecha = fecha;
        this.medico = medico;
        this.consultorio = consultorio;
        this.paciente = paciente;
    }


}
