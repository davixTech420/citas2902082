package org.citas2902082.java.entities;

import org.citas2902082.java.entities.*;
import org.citas2902082.java.entities.enums.*;
import java.time.*;

public class CitaMedico extends Cita implements IAgendable {

    private String motivo;
    private Medico medico;
    private Estados estados;
    private Consultorio consultorio;

    public CitaMedico(Integer id, LocalDateTime fecha, Paciente paciente, String motivo, Medico medico,
            Consultorio Consultorio, Estados estados) {
        super(id, fecha, paciente);
        this.motivo = motivo;
        this.medico = medico;
        this.estados = estados;
    }5

    // getters y setters
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultario(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    @Override
    public String toString() {
        return "CitaMedico [id=" + id + ", motivo=" + motivo + ", medico=" + medico + ", estado=" + estados
                + ", getFecha()=" + getFecha() + ", getMotivo()=" + getMotivo() + ", Paciente()=" + getPaciente()
                + ", getMedico()=" + getMedico() + " Consultorio :" + getConsultorio() + " Estados :" + getEstados()
                + "]";
    }

    // metodos heredados del padre
    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        this.estados = Estados.CANCELADA;
    }

    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

}
