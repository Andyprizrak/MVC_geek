import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static DoctorSpesial type = DoctorSpesial.AllPractic;
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IHospital doctor = context.getBean("doctor", IHospital.class);
        doctor.chooseDoctor(type);

    }
}
