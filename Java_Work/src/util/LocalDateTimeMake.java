package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMake {
public static String now() {
	LocalDateTime now = LocalDateTime.now();
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/M/d a:h:m");
	String nowString = now.format(dateTimeFormatter);   
	return nowString;
}
}
