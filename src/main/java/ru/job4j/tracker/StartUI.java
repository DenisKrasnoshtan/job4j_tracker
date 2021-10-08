package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    Item item = new Item();
    LocalDateTime currentDateTime = item.getCreated();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String currentDateTimeFormat = currentDateTime.format(formatter);

}
