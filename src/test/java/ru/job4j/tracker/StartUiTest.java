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

    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId()), "edited item"};
        StartUi.replaceItem(new MockInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answer = {String.valueOf(item.getId())};
        StartUi.deleteItem(new MockInput(answer), tracker);
        Item deleted = tracker.findById(item.getId());
        Item[] erased = tracker.findAll();
        assertThat(deleted).isNull();
        assertThat(erased).isEmpty();
    }
}