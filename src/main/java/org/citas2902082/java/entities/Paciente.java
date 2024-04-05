package org.citas2902082.java.entities;

import java.time.*;
import org.citas2902082.java.entities.enums.*;

public class Paciente extends Usuario {

    private String email;
    private Integer celular;
    private LocalDateTime fechaNacimiento;
    private Double altura;
    private Double peso;
    private Sangre sangre;
    private String factorRH;

    public Paciente(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion, String email, Integer celular, LocalDateTime fechaNacimiento, Double altura,
            Double peso, Sangre sangre, String factorRH) {
        super(id, nombres, apellidos, tipoIdentificacion, numeroIdentificacion);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.sangre = sangre;
        this.factorRH = factorRH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Sangre getSangre() {
        return sangre;
    }

    public void setSangre(Sangre sangre) {
        this.sangre = sangre;
    }

    public String getFactorRH() {
        return factorRH;
    }

    public void setFactorRH(String factorRH) {
        this.factorRH = factorRH;
    }

    // constructor

    @Override
    public String toString() {
        return super.toString() + "Paciente [Documento =" + getNumeroIdentificacion() + ", Email= " + getEmail() + " Celular = "+  getCelular()+  " Fecha = " + getFechaNacimiento() + 
         " Altura = " + getAltura()  +  " Peso = " +  getPeso() + " Sangre = " +  getSangre() + "factor Rh = " +getFactorRH()+
        "]";

    }

}
