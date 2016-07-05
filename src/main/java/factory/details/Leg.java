package factory.details;

import org.springframework.stereotype.Component;

/**
 * Created by Rish on 02.07.2016.
 */
@Component
public class Leg extends Detail {

    public Leg() {
    }

    public Leg(String model, int id) {
        super(model, id);
    }

    @Override
    public String toString() {
        return ("Model: "+getModel()+"; ID: "+getId());
    }
}
