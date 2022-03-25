package Modelo;

public class Articulo {
    private String codigo = "nuevo";
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int numeroUnidades;

    public  Articulo(String codigo, String descripcion, double precioCompra, double precioVenta, int numeroUnidades){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.numeroUnidades = 0;
    }

    public  Articulo(String codigo, String descripcion, double precioCompra, double precioVenta){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString(){
        return "Datos del Modelo.Articulo\n" +
                "Codigo: " + this.codigo +
                "\nDescripcion: " + this.descripcion +
                "\nPrecio de Compra: " + this.precioCompra +
                "\nPrecio de Venta: " + this.precioVenta +
                "\nNumero de Articulos en Stock: " + this.numeroUnidades;
    }
}
