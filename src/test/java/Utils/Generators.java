package Utils;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class Generators {

    static Faker faker = new Faker();
    public static String FIRST_NAME_GENERATOR = faker.name().firstName();
    public static String LAST_NAME_GENERATOR = faker.name().lastName();
    public static String SHORT_CODE_GENERATOR = String.valueOf(faker.number().numberBetween(101,999));

}
