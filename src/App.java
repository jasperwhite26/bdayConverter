import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class App {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2006, 10, 26, 8, 53);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.print(birthdayZoned);
        System.out.print(birthdayParis);
    }
}
