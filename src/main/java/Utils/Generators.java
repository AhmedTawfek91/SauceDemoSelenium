package Utils;

import com.github.javafaker.Faker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Generators {

    static Faker faker = new Faker();
    public static String FIRST_NAME_GENERATOR = faker.name().firstName();
    public static String LAST_NAME_GENERATOR = faker.name().lastName();
    public static String SHORT_CODE_GENERATOR = String.valueOf(faker.number().numberBetween(101,999));
    public static String DATE_TIME_GENERATOR = (LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss")));
}
