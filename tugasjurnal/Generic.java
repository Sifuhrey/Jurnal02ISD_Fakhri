package tugasjurnal;

import java.util.*;

public class Generic<E> {
    private final ArrayList<E> list;

    public Generic(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 0;
        list = new ArrayList<>(initCapacity);
    }

    public void addData(E values) {
        list.add(values);
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }

    public void removeData(int index) {
        
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                list.remove(i);
            }
        }
    }

    public void setData(int index, E object2) {
        list.set(index, object2);
    }

}
