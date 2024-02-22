package compras;

public class Producto {

    public int codigo; //Notificar a esta gente /*Se supone que esta es una constante, pero crearon un funcion para cambiarla*/
    public String nombre;
    public String tipo;
    public static int totalProductosPedidos;

    public Producto(int codigo, String nombre, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void imprimirNombre() {
        System.out.print(nombre);
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getTotalProductosPedidos() {/*El metodo se llamaba desde clase pero este metodo es de instacia*/
        return totalProductosPedidos;//Notificar a esta gente
    }
}
