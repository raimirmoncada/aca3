import javax.swing.*;
public class persona
 {
    //ATRIBUTOS
    String id; 
    public String nombres;
    public String apellidos;
    public String genero;
    public int edad;
    
    //METODOS

    //CONSTRUCTOR
    public persona() 
    {
        this.id =JOptionPane.showInputDialog("digite su cedula");
        this.nombres =JOptionPane.showInputDialog("digite su nombre");
        this.apellidos =JOptionPane.showInputDialog("digite su apellido");
        this.genero =JOptionPane.showInputDialog("digite su genero");
        this.edad =Integer.parseInt(JOptionPane.showInputDialog("digite su edad"));
    }
    //GETTERS AND SETTERS
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;  
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad; 
    }

}