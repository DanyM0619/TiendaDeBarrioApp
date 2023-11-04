public class Product {

    private String idProduct;
    private String nombre;
    private double precio;

    public Product(String idProduct, String nombre, double precio) {
        this.idProduct = idProduct;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
