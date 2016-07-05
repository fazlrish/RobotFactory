package factory.details;

import org.springframework.stereotype.Component;

/**
 * Created by Rish on 02.07.2016.
 */
@Component
public class Head extends Detail {

    public Head(){
    }

    public Head(String model, int id) {
        super(model, id);
    }

    @Override
    public String toString() {
        return ("Model: "+getModel()+"; ID: "+getId());
    }

}
