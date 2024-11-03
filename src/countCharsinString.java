import java.util.*;
public class countCharsinString {
    public static void main(String[] args) {
        String str = "Gounipalli Anusha";
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

            System.out.println(map);

        }
    }
