
package lab6p2_fernandopadilla;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Consola {
    private String id, fabricantes;
    private int añosUso;
    private double precio;
    private ArrayList<Juego> juegosDisponibles = new ArrayList();
    private String modelo;

    public Consola() {
    }

    public Consola(String id, String fabricantes, int añosUso, double precio, ArrayList<Juego> juegosDisponibles, String modelo) {
        setId(id);
        this.fabricantes = fabricantes;
        this.añosUso = añosUso;
        this.precio = precio;
        this.juegosDisponibles = juegosDisponibles;
        this.modelo = modelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() == 4) {
            this.id = id;
        }else{
            JOptionPane.showMessageDialog(null, "El id debe ser de 4 caracteres");
        }
        
    }

    public String getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(String fabricantes) {
        this.fabricantes = fabricantes;
    }

    public int getAñosUso() {
        return añosUso;
    }

    public void setAñosUso(int añosUso) {
        this.añosUso = añosUso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegosDisponibles() {
        return juegosDisponibles;
    }

    public void setJuegosDisponibles(ArrayList<Juego> juegosDisponibles) {
        this.juegosDisponibles = juegosDisponibles;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
