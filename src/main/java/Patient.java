import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Patient {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //IDoctor doctor = context.getBean("doctor",IDoctor.class);
        RegistryImpl registry = context.getBean("registry", RegistryImpl.class);


        //сообщает куда нам нужно пройти и доктор говорит нам о своей готовности нас принять
        registry.doInfo();
        IDoctor doctor = registry.getDoctor();
        doctor.doCheckup();

//        //доктор сообщает что ждет нас
//        doctor.doCheckup();
//        //внесение записи о посещении
//        doctor.doNotation();
//
//        doctor.getRoom();

    }
}
