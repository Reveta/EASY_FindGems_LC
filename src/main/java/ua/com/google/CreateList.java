package ua.com.google;

import java.util.List;

/**
 * Цей інтерфей для того, щоб можна було
 * прийняти стрічку і перетворити її в
 * ліст. Використовується за умовою задачі
 * в конструкторі SearchingSystem.java*/

@FunctionalInterface
public interface CreateList {
    List<String> createList(String s);
}
