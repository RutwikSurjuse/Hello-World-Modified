import java.util.ArrayList;
import java.util.List;

public class Love {
    public static void main(String[] args) throws Exception {
        String name = String.join(" ", args);
        if (name.isEmpty()) name = "Hello World";
        List<Integer> Name = generateList(name);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < Name.size(); i++) {
            int start = 32;
            if (Name.get(i) == 32)
                result.append((char) start);
            else {
                while (start != Name.get(i)) {
                    start++;
                    result.replace(i, i + 1, Character.toString((char) start));
                    System.out.println(result);
                    Thread.sleep(3);
                }
            }
        }
    }

    private static List<Integer> generateList(String name) {
        List<Integer> arr = new ArrayList<>();
        for (char s : name.toCharArray()) {
            arr.add((int) s);
        }
        return arr;
    }
}