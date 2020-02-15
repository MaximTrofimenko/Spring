import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("healthCard")
@Scope("prototype")
public class HealthCard implements IHealthCard {

    public void setNotation(){
        System.out.println("У вас в карте появилась запись о посещении");
    }
}
