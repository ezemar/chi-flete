package Models;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Vehiculo extends RealmObject {
    @PrimaryKey
    public User userId;
    public String marca;
    public String modelo;
    public int capacidad;
    public String patente;


    // GETTERS MODEL VEHICULO
    public User getUserId() {
        return userId;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // SETTERS MODEL VEHICULO
    public void setUserId(User userId) {
        this.userId = userId;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}