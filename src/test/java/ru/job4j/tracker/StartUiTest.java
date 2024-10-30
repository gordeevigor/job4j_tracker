package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class StartUiTest {
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC", "Create token"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUi.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
        StartUi.createItem(input, tracker);
        Item created1 = tracker.findAll()[1];
        Item expected1 = new Item("Create token");
        assertThat(created1.getName()).isEqualTo(expected1.getName());
    }
}