import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class RegistryImpl implements IRegistry {

    private IDoctor doctor;

    @Autowired
    @Qualifier("doctor")
    public void setDoctor(IDoctor doctor) {
        this.doctor = doctor;
    }

    public IDoctor getDoctor(){
        return doctor;
    }



    public void doInfo() {
        System.out.println("Вам нужно пройти к доктору");
        doctor.doNotation();
    }
}
