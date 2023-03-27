import javax.swing.*;
public class cliente 
{
    //ATRIBUTOS
    private String ciudad;
    private String direccion;
    private String telefono;
    private String empresa;

    //METODOS 
    //CONSTRUCTOR
    public cliente() {
        this.ciudad= JOptionPane.showInputDialog("digite su ciudad");
        this.direccion= JOptionPane.showInputDialog("digite su direccion");
        this.telefono= JOptionPane.showInputDialog("digite su telefono");
        this.empresa= JOptionPane.showInputDialog("digite su empresa");
    }
    //GETTERS AND SETTERS
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    


    
}
