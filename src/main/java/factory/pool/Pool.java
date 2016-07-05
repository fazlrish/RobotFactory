package factory.pool;

import factory.robot.Robot;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Rish on 03.07.2016.
 */
public interface Pool {
    Map<Integer, Robot> getMap();

    void setMap(Map<Integer, Robot> robotMap);

    void showAllInMap();
}
