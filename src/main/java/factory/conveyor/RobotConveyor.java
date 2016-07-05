package factory.conveyor;

import factory.robot.Robot;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Rish on 03.07.2016.
 */
@Component( value = "conveyor")
@Scope
public class RobotConveyor implements Conveyor {

    @Lookup(value = "robot")
    public Robot create(){
        return new Robot();
    };
}
