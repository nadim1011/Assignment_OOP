// File: ArrayListGrowth.java
import java.lang.reflect.*;
import java.util.ArrayList;

public class ArrayListGrowth {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(10); // initial capacity = 10
        
        // Use reflection to access private field "elementData"
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        int oldCapacity = ((Object[]) field.get(list)).length;
        System.out.println("Initial capacity: " + oldCapacity);

        // Keep adding elements to exceed capacity
        for (int i = 0; i < 11; i++) { // add one more than initial capacity
            list.add(i);
        }

        int newCapacity = ((Object[]) field.get(list)).length;
        System.out.println("New capacity after exceeding: " + newCapacity);

        double growthRate = ((double) newCapacity / oldCapacity - 1) * 100;
        System.out.printf("Growth rate: %.0f%%\n", growthRate);
    }
}
