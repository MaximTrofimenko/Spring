import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("doctor")
@Scope("prototype")
public class Surgeon implements IDoctor{

    @Value("555555")
    private int ROOM;

    IHealthCard healthCard;

    @Autowired
    @Qualifier("healthCard2")
    public void setHealthCard(IHealthCard healthCard) {
        this.healthCard = healthCard;
    }

    public void doNotation(){
        healthCard.setNotation();
    }


    public void doCheckup() {
        System.out.println("Хирург: Я жду Вас на осмотр в кабинете " + ROOM + "!");
    }

}
