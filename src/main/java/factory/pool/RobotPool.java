package factory.pool;

import factory.conveyor.RobotConveyor;
import factory.robot.Robot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rish on 03.07.2016.
 */
@Repository(value = "robotPool")
@Scope
public class RobotPool implements Pool {


    Map<Integer, Robot> robotMap;

    public RobotPool(){
        robotMap = new HashMap<Integer, Robot>();
    };

    public RobotPool( Map<Integer, Robot> robotMap){
        this.robotMap = robotMap;
    }

    public Map<Integer, Robot> getMap() {
        return robotMap;
    }

    public void setMap(Map<Integer, Robot> robotMap) {
        this.robotMap = robotMap;
    }

    public void setRobotMap(Integer year, RobotConveyor conveyor) {
        robotMap.put(year, conveyor.create());
    }

    public void showAllInMap() {
        for (Integer year: robotMap.keySet()){
            System.out.println(year);
            robotMap.get(year).showCharacters();
        }
    }
}
