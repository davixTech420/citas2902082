package org.citas2902082.java.entities;

public class Consultorio {
private Integer id;
private String direccion;
private Integer numero;

//constructor
public Consultorio(String direccion, Integer numero) {
    this.direccion = direccion;
    this.numero = numero;
}



public Consultorio(){
}



public Integer getId() {
    return id;
}



public void setId(Integer id) {
    this.id = id;
}



public String getDireccion() {
    return direccion;
}



public void setDireccion(String direccion) {
    this.direccion = direccion;
}



public Integer getNumero() {
    return numero;
}



public void setNumero(Integer numero) {
    this.numero = numero;
}


}
