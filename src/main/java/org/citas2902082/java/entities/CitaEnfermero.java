
package org.citas2902082.java.entities;

import java.time.LocalDateTime;
import org.citas2902082.java.entities.*;

public class CitaEnfermero extends Cita implements IAgendable {


    private String procedimiento;
    private Enfermero enfermero;



    
    public CitaEnfermero( Integer id,
        LocalDateTime fecha,
                         Paciente paciente,
                         String procedimiento,
                          Enfermero enfermero) {
        super(id,fecha, paciente);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }


//getters y setters
    public String getProcedimiento() {
        return procedimiento;
    }



    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }



    public Enfermero getEnfermero() {
        return enfermero;
    }



    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }




    //implementadas de  ia agendable
    @Override
    public void agendarCita(LocalDateTime fecha) {
       super.setFecha(fecha);
    }


    @Override
    public void cancelarCita() {
        System.out.println("CITA  DE ENFERMERIA CANCELADA");
    }


    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }



    
    
}
