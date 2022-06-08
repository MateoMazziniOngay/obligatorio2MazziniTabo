package clases;


public class Deposito {
    private int numero;
    private int tamanio;
    private boolean estantes;
    private boolean refrigeracion;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int unNumero) {
        this.numero = unNumero;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int unTamanio) {
        this.tamanio = unTamanio;
    }
    public boolean isEstantes() {
        return estantes;
    }
    public void setEstantes(boolean estantes) {
        this.estantes = estantes;
    }
    public boolean isRefrigeracion() {
        return refrigeracion;
    }
    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }
}
