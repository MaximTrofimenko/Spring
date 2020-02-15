import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("doctor")
public class Therapist implements IDoctor {

    @Value("404")
    private int ROOM;

    IHealthCard healthCard;

    @Autowired
    @Qualifier("healthCard")
    public void setHealthCard(IHealthCard healthCard) {
        this.healthCard = healthCard;
    }


    public void doNotation(){
        healthCard.setNotation();
    }


    public void doCheckup() {
        System.out.println("Терапевт: Я жду Вас на осмотр в кабинете " + ROOM + "!");
    }

}
