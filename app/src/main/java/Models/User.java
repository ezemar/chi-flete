package Models;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class User extends RealmObject {
    @PrimaryKey
    private long id;
    private String nombre;
    private String apellido;
    private Email email;
    private String tipoUser;
    private String codigo_verificacion;
    private Direccion direccionUser;

    // GETERS MODEL USER
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Email getEmail() {
        return email;
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public String getCodigo_verificacion() {
        return codigo_verificacion;
    }

    public Direccion detDireccionUser() {
        return direccionUser;
    }

    // SETTER MODEL USER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public void setCodigo_verificacion(String codigo_verificacion) {
        this.codigo_verificacion = codigo_verificacion;
    }

    public void setDireccionUser(Direccion direccionUser) {
        this.direccionUser = direccionUser;
    }
}
