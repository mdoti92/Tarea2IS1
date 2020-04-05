
public class FuncionesUsuario {
    
    
    public double impuestos(Usuario u){
        int edad = u.getEdad();
        int hijos = u.getCantidadDeHijos();
        int descuentoHijos = hijos * 3;
        
        if(descuentoHijos > 50) descuentoHijos = 50;
        
        if(edad < 18) return 0;
        
        if(18 <= edad && edad < 30) return (2000 - (2000 * descuentoHijos / 100));
        
        if(30 <= edad && edad <= 65) return (7000 - (7000 * descuentoHijos / 100));
        
        if(65 < edad) return (2000 - (2000 * descuentoHijos / 100));
        
        return 0;
    }
}