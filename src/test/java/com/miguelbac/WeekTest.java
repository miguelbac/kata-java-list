package com.miguelbac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WeekTest {

    private Week week;

    @BeforeEach
    void setUp() {
        week = new Week();
        week.createList();
    }

    @Test
    void testCreateList_ShouldContainSevenDays() {
        assertThat(week.getLength(), is(equalTo(7)));
    }

    @Test
    void testGetWeek_ShouldReturnCorrectDays() {
        List<String> days = week.getWeek();
        assertThat(days, contains("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }

    @Test
    void testRemoveDayByIndex_ShouldRemoveCorrectDay() {
        week.removeDayByIndex(0);
        assertThat(week.getLength(), is(equalTo(6)));
        assertThat(week.getWeek(), not(hasItem("Lunes")));
    }

    @Test
    void testRemoveDayByName_ShouldRemoveCorrectDay() {
        week.removeDayByName("Martes");
        assertThat(week.getWeek(), not(hasItem("Martes")));
    }

    @Test
    void testContainsDay_ShouldReturnTrueIfDayExists() {
        assertThat(week.containsDay("Viernes"), is(true));
    }

    @Test
    void testContainsDay_ShouldReturnFalseIfDayDoesNotExist() {
        week.removeDayByName("Domingo");
        assertThat(week.containsDay("Domingo"), is(false));
    }

    @Test
    void testSortAlphabetically_ShouldSortDaysCorrectly() {
        week.sortAlphabetically();
        assertThat(week.getWeek(), contains("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"));
    }

    @Test
    void testClearList_ShouldEmptyTheList() {
        week.clear();
        assertThat(week.getLength(), is(equalTo(0)));
        assertThat(week.getWeek(), is(empty()));
    }
}
