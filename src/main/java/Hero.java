import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.reflect.Type;
@ToString
@Setter
@Getter
public class Hero {
    private String name;
    private int power;
    private String nameSuperPower;
    enum Type {MARVEL, DC};
    Type type;

}
