package clases;

public class Datos {

    private int maxUsu = 5;
    private int maxPro = 5;
    private Usuario misUsuarios[] = new Usuario[maxUsu];
    private Producto misProductos[] = new Producto[maxPro];
    
    private int conUsu = 0;
    private int conPro = 0;

    //Contructor de la clase Datos
    public Datos() {
        Usuario miUsuario;
        miUsuario = new Usuario("Juan", "Juan", "Flores", "2309", 1);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        miUsuario = new Usuario("jireh", "Academia", "jireh Music", "123", 2);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        miUsuario = new Usuario("jirehsoft", "Jireh", "Softwares", "123", 3);
        misUsuarios[conUsu] = miUsuario;
        conUsu++;

        Producto miProducto;
        miProducto = new Producto("1", "Coca Cola", 1, 1);
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("2", "Flete Local", 10, 2);
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("3", "Revision PC", 5, 2);
        misProductos[conPro] = miProducto;
        conPro++;
        miProducto = new Producto("4", "Laptop Acer", 200, 1);
        misProductos[conPro] = miProducto;
        conPro++;
    }

    public int numeroUsuarios() {
        return conUsu;
    }

    public int numeroProductos() {
        return conPro;
    }
    public Usuario[] getUsuarios() {
        return misUsuarios;
    }

    public Producto[] getProductos() {
        return misProductos;
    }
    public boolean validarUsuario(String usuario, String clave) {
        boolean aux = false;
        for (int i = 0; i < conUsu; i++) {
            if (misUsuarios[i].getIdUsuario().equalsIgnoreCase(usuario)
                    && misUsuarios[i].getClave().equals(clave)) {
                return true;
            }
        }
        return false;
    }

    public int PosicionUsuario(String usuario) {
        for (int i = 0; i < conUsu; i++) {
            if (misUsuarios[i].getIdUsuario().equalsIgnoreCase(usuario)) {
                return i;
            }
        }
        return -1;
    }

    public int posicionProducto(String producto) {
        for (int i = 0; i < conUsu; i++) {
            if (misProductos[i].getIdProducto().equalsIgnoreCase(producto)) {
                return i;
            }
        }
        return -1;
    }
    public String agregarUsuario(Usuario miUsuario) {
        if (conUsu == maxUsu) {
            return "Se ha alcanzado el maximo de usuarios";
        }

        misUsuarios[conUsu] = miUsuario;
        conUsu++;
        return "Usuario agregado correctamente";
    }

    public String agregarProducto(Producto miProducto) {
        if (conPro == maxPro) {
            return "Se ha alcanzado el maximo de productos";
        }

        misProductos[conPro] = miProducto;
        conPro++;
        return "Producto agregado correctamente";
    }
    public String modificarUsuario(Usuario miusuario, int pos) {
        misUsuarios[pos].setNombres(miusuario.getNombres());
        misUsuarios[pos].setApellidos(miusuario.getApellidos());
        misUsuarios[pos].setClave(miusuario.getClave());
        misUsuarios[pos].setPerfil(miusuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    
    public String modificarProducto(Producto miProducto, int pos) {
        misProductos[pos].setDescripcion(miProducto.getDescripcion());
        misProductos[pos].setPrecio(miProducto.getPrecio());
        misProductos[pos].setCategoria(miProducto.getCategoria());
        return "Producto modificado correctamente";
    }
    public String BorrarUsuario(int pos) {
        for (int i = pos;i < conUsu -1; i++){
            misUsuarios[i] = misUsuarios[i+1];
        }
        conUsu--;
        return "Usuario borrado correctamente";
    }
    
    public String BorrarProducto(int pos) {
        for (int i = pos;i < conPro -1; i++){
            misProductos[i] = misProductos[i+1];
        }
        conPro--;
        return "Producto borrado correctamente";
    }
}
