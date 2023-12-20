import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TestingJavaCollections {

    private final List<Integer> arrayList = new ArrayList<>();
    private final List<Integer> linkedList = new LinkedList<>();
    private final Set<Integer> hashSet = new HashSet<>();
    private final Set<Integer> treeSet = new TreeSet<>();
    private final Queue<Integer> priorityQueue = new PriorityQueue<>();
    private final Queue<Integer> arrayDeque = new ArrayDeque<>();
    private final Map<Integer, String> hashMap = new HashMap<>();
    private final Map<Integer, String> treeMap = new TreeMap<>();

    private final double[] timeFillResults = new double[8];
    private final double[] timeTestResults = new double[8];

    public void fillArrayListCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[0] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до ArrayList становить: " + timeResult + " секунд");
    }

    public void fillLinkedListCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            linkedList.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[1] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до LinkedList становить: " + timeResult + " секунд");

    }

    public void fillHashSetCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            hashSet.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[2] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до HashSet становить: " + timeResult + " секунд");

    }

    public void fillTreeSetCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            treeSet.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[3] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до TreeSet становить: " + timeResult + " секунд");

    }

    public void fillPriorityQueueCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            priorityQueue.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[4] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до PriorityQueue становить: " + timeResult + " секунд");

    }

    public void fillArrayDequeCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            arrayDeque.add(i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[5] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до ArrayDeque становить: " + timeResult + " секунд");

    }

    public void fillHashMapCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            hashMap.put(i, "Element: " + i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[6] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до HashMap становить: " + timeResult + " секунд");

    }

    public void fillTreeMapCollection(int amount) {
        long startTime = System.nanoTime();
        for (Integer i = 0; i < amount; i++) {
            treeMap.put(i, "Element: " + i);
        }
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeFillResults[7] = timeResult;
        System.out.println("Час додавання " + amount + " елементів до TreeMap становить: " + timeResult + " секунд");

    }

    public void fillAllCollections(int amount) {
        fillArrayListCollection(amount);
        fillLinkedListCollection(amount);
        fillHashSetCollection(amount);
        fillTreeSetCollection(amount);
        fillPriorityQueueCollection(amount);
        fillArrayDequeCollection(amount);
        fillHashMapCollection(amount);
        fillTreeMapCollection(amount);
    }

    public void showTimeFillResults() {
        for (int i = 0; i < timeFillResults.length; i++) {
            for (int j = i; j < timeFillResults.length - 1; j++) {
                double currentElement = timeFillResults[i];
                double nextElement = timeFillResults[j + 1];
                if (currentElement > nextElement) {
                    timeFillResults[i] = nextElement;
                    timeFillResults[j + 1] = currentElement;
                }
            }
        }

        System.out.println("Результуюча таблиця, відсортована за найкращим часовим показником:");
        for (int i = 0; i < timeFillResults.length; i++) {
            System.out.println(timeFillResults[i]);
        }
    }

    public void testArrayListCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = arrayList.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[0] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в ArrayList становить: " + timeResult + " секунд");
    }

    public void testLinkedListCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = linkedList.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[1] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в LinkedList становить: " + timeResult + " секунд");

    }

    public void testHashSetCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = hashSet.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[2] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в HashSet становить: " + timeResult + " секунд");

    }

    public void testTreeSetCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = treeSet.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[3] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в TreeSet становить: " + timeResult + " секунд");

    }

    public void testPriorityQueueCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = priorityQueue.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[4] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в PriorityQueue становить: " + timeResult + " секунд");

    }

    public void testArrayDequeCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = arrayDeque.stream()
            .filter(a -> a % 2 == 0)
            .map(a -> a * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[5] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в ArrayDeque становить: " + timeResult + " секунд");

    }

    public void testHashMapCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = hashMap.entrySet().stream()
            .filter(a -> a.getKey() % 2 == 0)
            .map(a -> a.getKey() * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[6] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в HashMap становить: " + timeResult + " секунд");

    }

    public void testTreeMapCollection(int amount) {
        long startTime = System.nanoTime();
        List<Integer> resultArrayList = treeMap.entrySet().stream()
            .filter(a -> a.getKey() % 2 == 0)
            .map(a -> a.getKey() * 2)
            .collect(Collectors.toList());
        long endTime = System.nanoTime();
        double timeResult = ((endTime - startTime) / 1000000000.0);
        timeTestResults[7] = timeResult;
        System.out.println("Час фільтрації та множення кожного елементу на 2 - " + amount + " елементів в TreeMap становить: " + timeResult + " секунд");

    }

    public void testAllCollections(int amount) {
        testArrayListCollection(amount);
        testLinkedListCollection(amount);
        testHashSetCollection(amount);
        testTreeSetCollection(amount);
        testPriorityQueueCollection(amount);
        testArrayDequeCollection(amount);
        testHashMapCollection(amount);
        testTreeMapCollection(amount);
    }

    public void showTimeTestResults() {
        for (int i = 0; i < timeTestResults.length; i++) {
            for (int j = i; j < timeTestResults.length - 1; j++) {
                double currentElement = timeTestResults[i];
                double nextElement = timeTestResults[j + 1];
                if (currentElement > nextElement) {
                    timeTestResults[i] = nextElement;
                    timeTestResults[j + 1] = currentElement;
                }
            }
        }

        System.out.println("Результуюча таблиця, відсортована за найкращим часовим показником:");
        for (int i = 0; i < timeTestResults.length; i++) {
            System.out.println(timeTestResults[i]);
        }
    }
}
