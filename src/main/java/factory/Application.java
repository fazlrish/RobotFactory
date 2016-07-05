package factory;

import factory.conveyor.Conveyor;
import factory.conveyor.RobotConveyor;
import factory.pool.RobotPool;
import factory.robot.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rish on 02.07.2016.
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        RobotConveyor conveyor = (RobotConveyor) context.getBean("conveyor");
        RobotPool robotPool = (RobotPool) context.getBean("robotPool");
        robotPool.setRobotMap(2015,conveyor);
        robotPool.setRobotMap(2016,conveyor);
        robotPool.setRobotMap(2017,conveyor);
        RobotPool robotPool1 = (RobotPool) context.getBean("robotPool");
        robotPool1.showAllInMap();





/*
        RobotPool pool = (RobotPool) context.getBean("fillPool");
        pool.showAllInMap();
*/

    }

}
