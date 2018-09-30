package Models;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Email extends RealmObject {
    @PrimaryKey
    public String email;
    public boolean active;


    // GETERS MODEL EMAIL
    public String getEmail() {
        return email;
    }

    public boolean getActive() {
        return active;
    }

    // SETERS MODEL EMAIL
    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
