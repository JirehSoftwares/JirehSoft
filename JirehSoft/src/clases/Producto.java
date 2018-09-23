package clases;

public class Producto {
private String idProducto;
private String descripcion;
private int precio;
private int categoria;

    public Producto(String idProducto, String descripcion, int precio, int categoria) {
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }



}
