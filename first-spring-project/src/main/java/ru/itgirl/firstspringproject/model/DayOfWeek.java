package ru.itgirl.firstspringproject.model;

public enum DayOfWeek {
    MONDAY ("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY ("четверг"),
    FRIDAY ("пятница"),
    SATURDAY ("суббота"),
    SUNDAY ("воскресенье"),
    NOT_FOUND ("День недели")
    ;

    final String name;

    DayOfWeek (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
