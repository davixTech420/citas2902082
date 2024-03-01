package org.citas2902082.java.entities;
import java.time.*;
import org.citas2902082.java.entities.enums.*;

public class Paciente {

public Integer id;
public String nombres;
public String apellidos;
public TipoIdentificacion tipoIdentificacion;
public Integer numeroIdentificacion;
public String email;
public Integer celular;
public LocalDateTime fechaNacimiento;
public Double altura;
public Double peso;
public Sangre sangre;
public char factorRH;

//constructor
public Paciente(String nombres, String apellidos, TipoIdentificacion tipoIdentificacion, Integer numeroIdentificacion,
        String email, Integer celular, LocalDateTime fechaNacimiento, Double altura, Double peso, Sangre sangre,
        char factorRH) {
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.tipoIdentificacion = tipoIdentificacion;
    this.numeroIdentificacion = numeroIdentificacion;
    this.email = email;
    this.celular = celular;
    this.fechaNacimiento = fechaNacimiento;
    this.altura = altura;
    this.peso = peso;
    this.sangre = sangre;
    this.factorRH = factorRH;
}


}
