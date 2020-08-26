import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("hospital")
@Scope("prototype")

public class Hospital implements IHospital {

    @Autowired(required = false)
    @Qualifier("Dantist")
    private IReseption hospitalnoDoctor;

    @Autowired(required = false)
    @Qualifier("Allpractic")
    private IReseption hospitalDoctor;

    public void chooseDoctor(DoctorSpesial type) {
        System.out.println("Талон");

        if (type == DoctorSpesial.AllPractic) {
            hospitalnoDoctor.processing();
        } else  {
            hospitalDoctor.processing();
        }
    }

    public void chooseDoctor() {
        System.out.println("Талон к врачу");
       hospitalDoctor.processing();
    }

}


