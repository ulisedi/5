package ejes5_5;

public class pizza {

  
    private String tamaño;
    private String tipo;
    private String estado;
    private int pedidas;
////////////
    public pizza() {
        tamaño = "mediana";
        tipo = "mediana";
        estado = "pedida";

    }

    public pizza(String t, String ti, String e) {
        tamaño = t;
        tipo = ti;
        estado = e;
    }
////////////
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPedidas() {
        return pedidas;
    }

    public void setPedidas(int pedidas) {
        this.pedidas = pedidas;
    }
///
}
