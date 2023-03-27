public class tiquete {
    //ATRIBUTOS
    private String nrotiquete;
    private String ciudad;
    private int diashospedaje;
    private int costopersona;
    private int costocomida;
    public double descuentos;
    public double total;
    String formadepago;
    //METODOS
    //CONSTROCTOR
    public tiquete(String nrotiquete, String ciudad, int diashospedaje, int costopersona, int costocomida,
            double descuentos, double total, String formadepago) {
        this.nrotiquete = nrotiquete;
        this.ciudad = ciudad;
        this.diashospedaje = diashospedaje;
        this.costopersona = costopersona;
        this.costocomida = costocomida;
        this.descuentos = descuentos;
        this.total = total;
        this.formadepago = formadepago;
    }
    //GETTERS AND SETTERS
    public String getNrotiquete() {
        return nrotiquete;
    }
    public void setNrotiquete(String nrotiquete) {
        this.nrotiquete = nrotiquete;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getDiashospedaje() {
        return diashospedaje;
    }
    public void setDiashospedaje(int diashospedaje) {
        this.diashospedaje = diashospedaje;
    }
    public int getCostopersona() {
        return costopersona;
    }
    public void setCostopersona(int costopersona) {
        this.costopersona = costopersona;
    }
    public int getCostocomida() {
        return costocomida;
    }
    public void setCostocomida(int costocomida) {
        this.costocomida = costocomida;
    }
    public double getDescuentos() {
        return descuentos;
    }
    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getFormadepago() {
        return formadepago;
    }
    public void setFormadepago(String formadepago) {
        this.formadepago = formadepago;
    }
    


}
