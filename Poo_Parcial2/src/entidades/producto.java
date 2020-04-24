package entidades;

import interfaces.compraProducto;
import interfaces.ventaProducto;

/**
 *
 * @author PARKER (PC)
 */
public abstract class producto implements compraProducto, ventaProducto{
    public String codigoProducto;
    public String nombreProducto;
    public double precioProducto;
    public String fechaVen;
    public int stock;

    @Override
    public void compra(int cantidad) {
        this.stock = this.stock + cantidad;
    }

    @Override
    public void vender(int cantidad) {
        this.stock = this.stock - cantidad;
    }
}
    

