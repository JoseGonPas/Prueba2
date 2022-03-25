package Modelo;

public class Almacen {
    Articulo[] lista;

    public Almacen() {
        lista = new Articulo[0];
    }

    public Almacen(Articulo nuevo) {
        lista = new Articulo[1];
        lista[0] = nuevo;
    }

    @Override
    public String toString() {
        String salida = new String();
        for (Articulo articulo : lista) {
            salida += articulo.toString() + "\n";
        }
        return salida;
    }

    public void insertarArticulo(Articulo nuevo) {
        Articulo[] aux = new Articulo[lista.length + 1];
        for (int i = 0; i < lista.length; i++) {
            aux[i] = lista[i];
        }
        aux[lista.length] = nuevo;
        lista = aux;
    }

    public boolean eliminarArticulo(String codigo) {
        int posicion = obtenerPos(codigo);
        if(posicion != -1){
            Articulo[] aux = new Articulo[lista.length - 1];
            int j = 0;
            for (int i = 0; i < lista.length; i++) {
                if (i != posicion) {
                    aux[j] = lista[i];
                    j++;
                }
            }
            lista = aux;
            return true;
        }
       return false;
    }


    public int obtenerPos(String codigo){
        for(int i = 0; i < lista.length; i++){
            if(codigo.equals(lista[i].getCodigo())){
                return i;
            }
        }
        return -1;
    }

    public void modificarMercancia(int pos, String codigo, String descripcion, double precioCompra, double precioVenta, int numeroUnidades){
        lista[pos].setCodigo(codigo);
        lista[pos].setDescripcion(descripcion);
        lista[pos].setPrecioCompra(precioCompra);
        lista[pos].setPrecioVenta(precioVenta);
    }

    public boolean recibirMercancia(String codigo, int cantidad){
        int pos = obtenerPos(codigo);
        if (pos >= 0){
            lista[pos].setNumeroUnidades(lista[pos].getNumeroUnidades()+cantidad);
            return true;
        }
        return false;
    }
}
