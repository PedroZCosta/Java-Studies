package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Maria");
        hashMap.put(2, "João");
        hashMap.put(3, "Pedro");
        hashMap.put(4, "Ana");
        hashMap.put(5, "José");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            if (entry.getValue().equals("João")) {
                hashMap.put(entry.getKey(), "Jonas");
                break; // Se só quiser substituir o primeiro "João" encontrado
            }
        }
    }
}
