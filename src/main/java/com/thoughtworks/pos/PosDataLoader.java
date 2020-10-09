package com.thoughtworks.pos;

import java.util.LinkedHashMap;
import java.util.Map;

public class PosDataLoader {

  public static Map<String, String> loadAllItems() {
    Map<String, String> items = new LinkedHashMap<String, String>() {
    };
    items.put("ITEM000000", "Coca-Cola,3");
    items.put("ITEM000001", "Sprite,3");
    items.put("ITEM000002", "Apple,5");
    items.put("ITEM000003", "Litchi,15");
    items.put("ITEM000004", "Battery,2");
    items.put("ITEM000005", "Instant Noodles,4");
    return items;
  }

  public static String[] loadCart() {
    return new String[]{
        "ITEM000000",
        "ITEM000000",
        "ITEM000000",
        "ITEM000000",
        "ITEM000000",
        "ITEM000001",
        "ITEM000001",
        "ITEM000004"
    };
  }
}