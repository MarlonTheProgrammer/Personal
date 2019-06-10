/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author vgirr
 */
@Entity
@Table(name = "Vendedor")
public class Vendedor {
    @Id
    private int cedula;
    @Column(nullable = false, length = 100)
    private String nombre;
    @Column(nullable = false, length = 100)
    private String contraseña;
    @Column(precision = 10)
    private int celular;
    @Column(precision = 20)
    private String direccion;

    public Vendedor() {
    }

    public Vendedor(int cedula, String nombre, String contraseña, int celular, String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.celular = celular;
        this.direccion = direccion;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cedula=" + cedula + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", celular=" + celular + ", direccion=" + direccion + '}';
    }
    
    

}
