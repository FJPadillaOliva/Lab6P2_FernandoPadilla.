
package lab6p2_fernandopadilla;

import java.util.ArrayList;


public class Estacionaria extends Consola{
    private int controles, almacenamiento;
    private String tipoC;

    public Estacionaria() {
    }

    public Estacionaria(int controles, int almacenamiento, String tipoC, String id, String fabricantes, int añosUso, double precio, String modelo) {
        super(id, fabricantes, añosUso, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.tipoC = tipoC;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }
    
    
}
