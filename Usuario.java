
package Datos;

//Clase principal
public class Usuario {
    //Declaración de variables 
    private String nombre, apellidos, telefono, sexo, edad, direccion;
    //Constructor
    public Usuario(String nombre, String apellidos, String telefono, String sexo, String edad, String direccion) {
        //El valor de las variables por parametro  se le asigna a la de la clase Usuario
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion; 
    }
    //Métodos setter u getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override//Sobreescribiendo el método
    public String toString() {//Permite mostrar la información de un objeto
        return nombre+" "+apellidos;//Devuelve nombre y apellidos
    }
}
