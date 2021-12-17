package baitap.usemap;

import java.util.HashMap;
import java.util.Set;

public class useMap {
    public static void main(String[] args) {
        String str = "Duong Quoc Cuong dep trai trai";
        String[] arr = str.split(" ");
        Integer value;
        HashMap<String, Integer> map = new HashMap<>();
        String key;
        for (String s : arr) {
            key = s;
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> set = map.keySet();

        for (String o : set) {
            key = o;
            System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
        }
    }
}
