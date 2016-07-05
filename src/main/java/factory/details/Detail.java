package factory.details;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Rish on 03.07.2016.
 */
public abstract class Detail {
    @Value(value = "Panama")
    private String model;
    @Value(value = "15")
    private int id;

    public Detail() {
    }

    public Detail(String model, int id) {

        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setId(int id) {
        this.id = id;
    }
}
