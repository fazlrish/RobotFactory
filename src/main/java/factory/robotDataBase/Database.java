package factory.robotDataBase;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by Rish on 03.07.2016.
 */
@Component(value = "dataBase")
public class Database {

    Database(){
        testConnection();
    }

    private void testConnection() {
        System.out.println("Data base connection success");
    }


}
