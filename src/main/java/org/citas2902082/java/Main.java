package org.citas2902082.java;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

import javax.lang.model.element.PackageElement;
import javax.security.auth.PrivateCredentialPermission;

import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.*;

public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico(1, "Cristhian", "Garcia", TipoIdentificacion.CC, 1032677592L, 1312L,
                Especialidad.PEDIATRIA);
        System.out.println(m1.toString());

        Medico m2 = new Medico(2, "Sebastian", "Botero", TipoIdentificacion.CC, 1032564564L, 1313L,
                Especialidad.MEDICINA_GENERAL);
        System.out.println(m2.toString());

        /** PACIENTES */

        Paciente p1 = new Paciente(1, "Andrea", "Amaya", TipoIdentificacion.CC, 1457862985L,
                "andrea@andrea",
                324285725,
                LocalDateTime.of(2005, Month.MARCH, 4, 1, 51, 14), 1.71, 62.4, Sangre.A, "+");
        System.out.println(p1.toString());

        Paciente p2 = new Paciente(2, "Pedrito", "Lopez", TipoIdentificacion.CC, 1457862565L,
                "pedro@pedro",
                324285475,
                LocalDateTime.of(1950, Month.MARCH, 4, 1, 51, 14), 1.51, 60.2, Sangre.B, "+");
        System.out.println(p2.toString());

        Paciente p3 = new Paciente(3, "Alvaro", "Garcia", TipoIdentificacion.CC, 1457867855L,
                "alvaro@alvaro",
                324284825,
                LocalDateTime.of(1999, Month.APRIL, 4, 1, 51, 14), 1.75, 60.8, Sangre.B, "+");
        System.out.println(p3.toString());

        Paciente p4 = new Paciente(4, "Eidan", "Amaya", TipoIdentificacion.TI, 1457867425L,
                "eidan@eidan",
                324284825,
                LocalDateTime.of(2016, Month.FEBRUARY, 4, 1, 51, 14), 1.75, 60.8, Sangre.A, "+");
        System.out.println(p4.toString());

        Paciente p5 = new Paciente(5, "Eylin", "Amaya", TipoIdentificacion.TI, 1457867169L,
                "eylin@eylin",
                324242525,
                LocalDateTime.of(2018, Month.DECEMBER, 4, 1, 51, 14), 1.40, 40.5, Sangre.A, "+");
        System.out.println(p5.toString());

        /** ENFERMEROS */

        Enfermero e1 = new Enfermero(1, "Andres", "Parra",
                TipoIdentificacion.CC, 1065585422L);
        System.out.println(e1.toString());

        Enfermero e2 = new Enfermero(2, "Yamile", "Rocha",
                TipoIdentificacion.CC, 1065585462L);
        System.out.println(e2.toString());

        Enfermero e3 = new Enfermero(3, "Lucy", "Rocha",
                TipoIdentificacion.CC, 1065542822L);
        System.out.println(e3.toString());


         Consultorio con = new Consultorio(1, "Calle 50", 212);
         Consultorio con1 = new Consultorio(2,"calle 80",315) ;


        CitaMedico cm1 = new CitaMedico(1, LocalDateTime.of(2024, Month.APRIL, 4, 5, 30, 0), p5,
                "Gripa", m2 , con, Estados.CANCELADA);
        System.out.println(cm1.toString());


         
        CitaMedico cm2 = new CitaMedico(2, LocalDateTime.of(2024, Month.AUGUST, 5, 7, 30, 0), p1,
                "Escopolamina", m1 ,con1, Estados.AGENDADA);
        System.out.println(cm2.toString());

    }
}