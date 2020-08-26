import java.util.Arrays;

public enum DoctorSpesial {
    Dantist(1,"Dantist"),
    AllPractic(2,"AllPractic");

    private final int id;
    private final String name;

    DoctorSpesial (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static DoctorSpesial getById(int id) {
        return Arrays.stream(values())
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
