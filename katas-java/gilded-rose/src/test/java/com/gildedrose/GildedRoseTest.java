package com.gildedrose;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GildedRoseTest {

  @Test
  public void quality_degrades_twice_when_sell_by_date_passed() {
    Item[] items = new Item[]{new Item("foo", 0, 10)};
    GildedRose app = new GildedRose(items);

    app.updateQuality();

    assertEquals(8, app.items[0].quality);
  }

  @Test
  public void quality_of_an_item_is_never_negative() {
    Item[] items = new Item[]{new Item("foo", 0, 1)};
    GildedRose app = new GildedRose(items);

    app.updateQuality();

    assertEquals(0, app.items[0].quality);
  }

}

