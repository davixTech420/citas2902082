package org.citas2902082.java.entities;
 import java.time.*;
import org.citas2902082.java.entities.Paciente;

public class Cita {
    protected Integer id;
    private LocalDateTime fecha;
    private Paciente paciente;
    private Consultorio consultorio;


    //constructor
    public Cita(Integer id, LocalDateTime fecha, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
    }


    //getters y setters
    public LocalDateTime getFecha() {
        return fecha;
    }


    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Consultorio getConsultorio() {
        return consultorio;
    }


    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    

    
    


}
