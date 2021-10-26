package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            } else {
                throw new ElementNotFoundException("Элемент не найден.");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"value"}, "key");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
