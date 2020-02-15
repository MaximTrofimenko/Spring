import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="healthCard")
    public IHealthCard healthCard() {
        return new HealthCard() ;
    }

    @Bean(name="healthCard2")
    public IHealthCard healthCard2() {
        return new HealthCard2() ;
    }

    @Bean(name="doctor")
    public IDoctor doctor(){
        return new Surgeon();
    }
    @Bean(name="doctor2")
    public IDoctor doctor2(){
        return new Therapist();
    }

//    public IDoctor doctor(IHealthCard healthCard){
//        IDoctor doctor = new Surgeon();
//        doctor.setHealthCard(healthCard);
//        return doctor;


    @Bean(name="registry")
    public RegistryImpl registry() {
        return new RegistryImpl();
    }
}
