import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("Dantist")
@Scope("prototype")
public class Dantist implements IReseption {
    Integer res = 0;

    Random random = new Random();

    public Dantist() {             //public ColorCameraRoll() {
        res = random.nextInt();
    }

    public void processing() {
        System.out.println("Прием у стоматолога");
        System.out.println(res);
    }

}
