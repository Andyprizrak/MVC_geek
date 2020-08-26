import org.springframework.stereotype.Component;

@Component("Allpractic")
public class AllPractic implements IReseption {
    public void processing() {
        System.out.println("Прием терапевта");

    }
}
