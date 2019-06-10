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
@Table(name = "Loteria")
public class Loteria {
    @Id
    private String ciudad;

    public Loteria() {
    }

    public Loteria(String ciudad, String fecha, int numeroGanador) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    } 

    @Override
    public String toString() {
        return "Loteria{" + "ciudad=" + ciudad + '}';
    }
}
