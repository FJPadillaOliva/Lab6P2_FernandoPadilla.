
package lab6p2_fernandopadilla;

import java.util.Date;


public class Juego {
    private String nombre, desc;
    private Date fechaL;
    private double precio;
    private String estado;
    private boolean rentable, agregado;
    private int cantidadDisponible;

    public Juego() {
    }

    public Juego(String nombre, String desc, Date fechaL, double precio, String estado, boolean rentable, boolean agregado, int cantidadDisponible) {
        this.nombre = nombre;
        this.desc = desc;
        this.fechaL = fechaL;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getFechaL() {
        return fechaL;
    }

    public void setFechaL(Date fechaL) {
        this.fechaL = fechaL;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return nombre +" Cantidad disponible: "+ cantidadDisponible;
    }
    
    
}
