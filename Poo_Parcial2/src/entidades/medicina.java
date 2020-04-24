package entidades;

/**
 *
 * @author PARKER (PC)
 */
public class medicina extends producto{
    public String tipoMedicina;
    
    public medicina(String codigo, String nombre, double precio,String fecha, int stock, String tipo){
        this.codigoProducto = codigo;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        this.fechaVen = fecha;
        this.stock = stock;  
        this.tipoMedicina = tipo;
    }
    // Metodo Vender
    medicina(String codigo, String nombre, double precio, int cant){
    this.codigoProducto = codigo;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        this.stock = stock;  
    }
    // Metodo Comprar
    public medicina(String codigo, String nombre, String tipo, int stock, double precio){
        this.codigoProducto = codigo;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
        this.stock = stock;  
        this.tipoMedicina = tipo;
    }
    @Override
    public void compra(int cantComprar) {
        this.stock = this.stock + cantComprar;
    }
    @Override
    public void vender(int cantVender) {
        this.stock = this.stock - cantVender;
    }
}
