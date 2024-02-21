import java.util.*;

public class Main {
    public static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание №1");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        Collections.sort(nums);

        int prevNum = Integer.MIN_VALUE;

        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }

    public static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание №4");
        Map<String, Integer> countMap = new HashMap<>();
        strings.forEach(str -> {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
        });

        for (Map.Entry<String, Integer> elem : countMap.entrySet()) {
            String word = elem.getKey();
            Integer count = elem.getValue();
            if (count > 1) {
                System.out.println("Слово " + word + " имеет " + count + " дублей.");
            } else System.out.println("Слово " + word + " дублей не имеет - в ихсодном списке встречается 1 раз.");
        }
    }
}