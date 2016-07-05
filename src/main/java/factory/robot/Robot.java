package factory.robot;

import factory.details.Hand;
import factory.details.Head;
import factory.details.Leg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Rish on 02.07.2016.
 */
@Component(value = "robot")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@DependsOn(value = "dataBase")
public class Robot {
    @Autowired
    private Head head;
    @Autowired
    private Hand hand;
    @Autowired
    private Leg leg;


    public Robot() {
    }

    private void init() {
        System.out.println("Robot was created");
    }

    private void destroy() {
        System.out.println("Robot was removed");
    }


    public Robot(Head head, Hand hand, Leg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
    public void setModel(String model) {
        head = new Head(model, 1);
        hand = new Hand(model, 1);
        leg = new Leg(model, 1);
    }

    public void showCharacters() {
        System.out.println(head.toString());
        System.out.println(hand.toString());
        System.out.println(leg.toString());
    }

}
