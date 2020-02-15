import org.springframework.stereotype.Component;

@Component("healthCard2")
public class HealthCard2 implements IHealthCard {
    public void setNotation() {
        System.out.println("У вас в карте2 появилась запись о посещении");
    }
}
