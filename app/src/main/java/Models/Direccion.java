package Models;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Direccion extends RealmObject {
    @PrimaryKey
    private long id;
    private String calle;
    private int numero;
    private String localidad;
    private String provincia;
    private String codigo_postal;
    private long latitud;
    private long longitud;

    // GETERS MODEL Direccion
    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCod_postal() {
        return codigo_postal;
    }

    public long getLatitud() {
        return latitud;
    }

    public long getLongitud() {
        return longitud;
    }

    // SETTER MODEL Direccion
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setLatitud(long latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(long longitud) {
        this.latitud = longitud;
    }
}
