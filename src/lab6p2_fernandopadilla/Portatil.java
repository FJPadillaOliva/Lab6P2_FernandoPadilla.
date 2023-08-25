
package lab6p2_fernandopadilla;

import java.util.ArrayList;


public class Portatil extends Consola{
    private String screenSize;
    private int bateria;
    private boolean estuche;

    public Portatil() {
    }

    public Portatil(String screenSize, int bateria, boolean estuche, String id, String fabricantes, int añosUso, double precio, String modelo) {
        super(id, fabricantes, añosUso, precio,modelo);
        this.screenSize = screenSize;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
    
    
}
