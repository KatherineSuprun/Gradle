import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    public static void main(String[] args) {
        System.out.println("Hello :)");
    }
            private String name;
    private int age;
    private double height;
}
