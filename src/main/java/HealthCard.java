import org.springframework.stereotype.Component;

@Component("healthCard")
public class HealthCard implements IHealthCard {

    public void setNotation(){
        System.out.println("У вас в карте появилась запись о посещении");
    }
}
