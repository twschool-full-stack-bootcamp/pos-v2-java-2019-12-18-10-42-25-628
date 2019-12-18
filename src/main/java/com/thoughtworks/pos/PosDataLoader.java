package com.thoughtworks.pos;

import java.util.LinkedHashMap;
import java.util.Map;

public class PosDataLoader {
    public static Map<String, String> loadAllItems() {
        Map<String, String> items = new LinkedHashMap<String, String>() {
        };
        items.put("ITEM000001", "可乐,3,瓶");
        items.put("ITEM000002", "雪碧,3,瓶");
        items.put("ITEM000003", "羽毛球,1,个");
        items.put("ITEM000004", "方便面,4.5,袋");
        items.put("ITEM000005", "苹果,5.5,斤");
        items.put("ITEM000006", "香蕉,4,斤");

        return items;
    }

    public static String[] loadCart() {
        return new String[]{"ITEM000001", "ITEM000001", "ITEM000001", "ITEM000001",
                "ITEM000001", "ITEM000003", "ITEM000003", "ITEM000005-3", "ITEM000006-3.4"};
    }

    public static String[] loadPromotion() {
        return new String[]{"ITEM000001", "ITEM000003"};
    }
}