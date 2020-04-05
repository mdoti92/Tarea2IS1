import java.util.Objects;

/**
 *
 * @author TitanDriom
 */
public class Usuario {
    private String nombre;
    private String cedula;
    private String contrasenia;
    private int edad;
    private int cantidadDeHijos;
    private int saldo = 0;
    
	public Usuario() {
    }
    
    public Usuario(String nombre, String cedula, String contrasenia, int edad, int cantidadDeHijos) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.contrasenia = contrasenia;
        this.edad = edad;
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadDeHijos() {
        return cantidadDeHijos;
    }

    public void setCantidadDeHijos(int cantidadDeHijos) {
        this.cantidadDeHijos = cantidadDeHijos;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.contrasenia, other.contrasenia)) {
            return false;
        }
        return true;
    }
}