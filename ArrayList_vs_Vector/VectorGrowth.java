// File: VectorGrowth.java
import java.lang.reflect.*;
import java.util.Vector;

public class VectorGrowth {
    public static void main(String[] args) throws Exception {
        Vector<Integer> vector = new Vector<>(10); // initial capacity = 10

        // Use reflection to access private field "elementData"
        Field field = Vector.class.getDeclaredField("elementData");
        field.setAccessible(true);

        int oldCapacity = ((Object[]) field.get(vector)).length;
        System.out.println("Initial capacity: " + oldCapacity);

        // Add elements to exceed capacity
        for (int i = 0; i < 11; i++) { // exceed by one
            vector.add(i);
        }

        int newCapacity = ((Object[]) field.get(vector)).length;
        System.out.println("New capacity after exceeding: " + newCapacity);

        double growthRate = ((double) newCapacity / oldCapacity - 1) * 100;
        System.out.printf("Growth rate: %.0f%%\n", growthRate);
    }
}
