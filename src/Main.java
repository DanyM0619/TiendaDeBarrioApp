import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();
    public static List<User> personas = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){

        System.out.println("----------------------------------------");
        System.out.println("   Bienvenidos a la tienda de barrio    ");
        System.out.println("----------------------------------------");
        System.out.println("1.Ingresar un nuevo producto");
        System.out.println("2.Actualizar un producto");
        System.out.println("3.Listar todos los producto");
        System.out.println("4.Eliminar un producto existente");
        System.out.println("5.Salir del programa");
        seleccionarMenu();
    }

    public static void seleccionarMenu(){

        System.out.print("Por favor selecciona una opcion: ");
        int option = sc.nextInt();
        do {
            if (option <= 4) {
                menuSeleccionado(option);
            } else {
                System.out.println("Muchas gracias por utilizar nuestro programa");
                System.exit(0);
            }
        }while(option <= 4);

    }

    public static void menuSeleccionado(int option){

        switch (option){
            case 1-> agregarProducto();
            case 2-> actualizarProducto();
            case 3-> listarProducto();
            case 4-> eliminarProducto();
            default -> System.out.println("Muchas gracias por utilizar nuestro programa");
        }
    }

    public static void agregarProducto(){
        System.out.println("Registro de un producto \n");
        System.out.print("Registre el id: ");
        String id = sc.next();
        System.out.print("Registre su nombre: ");
        String name = sc.next();
        System.out.print("Registre su precio: ");
        double price = sc.nextDouble();
        Product producto = new Product(id, name, price);
        products.add(producto);
        agregarPersona();
        System.out.println("¡¡Producto agregado!!");

        seleccionarMenu();
    }

    public static void actualizarProducto(){
        System.out.println("Escriba el id del producto");
        String idP = sc.next();

        for(Product producto : products){
            if(idP.equals(producto.getIdProduct())){
                System.out.println("Registre el nombre nuevo del producto");
                String name = sc.next();
                producto.setNombre(name);
                System.out.println("Registre el precio nuevo del producto");
                double price =sc.nextDouble();
                producto.setPrecio(price);
                break;
            }
        }
        System.out.println("¡¡Producto actualizado!!");
        seleccionarMenu();
    }

    public static void listarProducto(){
        System.out.println("Estos son los productos actualizados");
        for(Product producto : products){
            System.out.println(producto);
        }
        mostrarPersonas();
        seleccionarMenu();
    }

    public static void eliminarProducto(){
        System.out.println("Ingrese el Id del producto para eliminar");
        String idP = sc.next();
        for(Product producto : products){
            if(idP.equals(producto.getIdProduct())) {
                products.remove(producto);
            }
        }
        System.out.println("¡¡Producto eliminado!!");
        seleccionarMenu();
    }

    public static void agregarPersona(){
        System.out.print("Ingrese la persona que lo compro: ");
        String name = sc.next();
        System.out.print("Ingrese el numero de la cedula: ");
        int id = sc.nextInt();
        System.out.print("Ingrese el numero de celular: ");
        long cell = sc.nextLong();
        System.out.print("Ingrese su correo electronico: ");
        String mail = sc.next();
        User person = new User(id, name, cell, mail);
        personas.add(person);
        System.out.println("Persona registrada exitosamente");
    }

    public static void mostrarPersonas(){
        System.out.println("La persona es: ");
        for(User person : personas){
            System.out.println(person);
        }

    }
}
