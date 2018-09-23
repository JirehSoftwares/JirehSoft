package clases;
public class Usuario {
private String idUsuario;
private String nombres;
private String apellidos;
private String Clave;
private int perfil;

//se crea un constructor con ad Code
    public Usuario(String idUsuario, String nombres, String apellidos, String Clave, int perfil) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.Clave = Clave;
        this.perfil = perfil;
    }
// se crea un constructor para setter y getter
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

}
